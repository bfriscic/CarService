/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Klijent;
import hr.friscic.zavrsnirad.utility.Iznimka;
import java.util.List;

/**
 *
 * @author K1R4
 */
public class ObradaKlijent extends ObradaOsoba<Klijent> {

    public ObradaKlijent() {

    }

    @Override
    protected void kontrolaCreate() throws Iznimka {
        super.kontrolaCreate();
        kontrolaOibBazaKreiraj();
        kontrolaKontaktBroj();

    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {
        super.kontrolaUpdate();
        kontrolaOibBazaPromjeni();
        kontrolaKontaktBroj();
    }

    @Override
    protected void kontrolaDelete() throws Iznimka {
        if (entitet.getVozila().size() > 0) {
            throw new Iznimka("Klijenta se ne može obrisati jer ima jedno ili više vozila!");
        }
    }

    private void kontrolaKontaktBroj() throws Iznimka {
        if (entitet.getKontaktbroj().isEmpty()) {
            throw new Iznimka("Kontakt broj ne smije biti prazan!");
        }
        if (!entitet.getKontaktbroj().matches("[0-9]+")) {
            throw new Iznimka("Kontakt broj nije valjan!");
        }
        if (entitet.getKontaktbroj().length()> 14) {
            throw new Iznimka("Kontakt broj nije valjan!");
        }
    }

    @Override
    public List<Klijent> getPodaci() {
        return session.createQuery("from Klijent").list();
    }

    public List<Klijent> getPodaci(String uvjet) {
        return session.createQuery("from Klijent k "
                + " where concat(k.ime, ' ', k.prezime, ' ', k.oib) "
                + " like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20)
                .list();
    }

    private void kontrolaOibBazaKreiraj() throws Iznimka {
        List<Klijent> lista = session.createQuery(""
                + " from Klijent k "
                + " where k.oib=:oib "
        )
                .setParameter("oib", entitet.getOib())
                .list();
        if (lista.size() > 0) {
            throw new Iznimka("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", unesite drugi OIB!");
        }

    }

    private void kontrolaOibBazaPromjeni() throws Iznimka {
        List<Klijent> lista = session.createQuery(""
                + " from Klijent k "
                + " where k.oib=:oib and k.id!=:id"
        )
                .setParameter("oib", entitet.getOib())
                .setParameter("id", entitet.getId())
                .list();
        if (lista.size() > 0) {
            throw new Iznimka("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", unesite drugi OIB!");
        }

    }

}
