/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Operater;
import hr.friscic.zavrsnirad.utility.Iznimka;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author K1R4
 */
public class ObradaOperater extends ObradaOsoba<Operater> {

    public Operater autoriziraj(String email, char[] lozinka) {

        Operater operater = (Operater) session.createQuery(
                "from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();

        if (operater == null) {
            return null;
        }

        return BCrypt.checkpw(new String(lozinka), operater.getLozinka())
                ? operater : null;
    }

    @Override
    protected void kontrolaCreate() throws Iznimka {
        super.kontrolaCreate();
        kontrolaUloga();
        kontrolaOibBazaKreiraj();
        kontrolaLozinka();

    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {
        super.kontrolaUpdate();
        kontrolaOibBazaPromjeni();
    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    @Override
    public List<Operater> getPodaci() {
        return session.createQuery("from Operater").list();
    }

    private void kontrolaUloga() throws Iznimka {
        if (entitet.getUloga() == null) {
            throw new Iznimka("Uloga je obavezna, ne može biti prazna!");
        }

    }

    private void kontrolaLozinka() throws Iznimka {
        if (entitet.getLozinka().isEmpty() || entitet.getLozinka() == null) {
            throw new Iznimka("Lozinka je obavezna, ne može biti prazna!");
        }
    }

    private void kontrolaOibBazaKreiraj() throws Iznimka {
        List<Operater> lista = session.createQuery(""
                + " from Operater o "
                + " where o.oib=:oib "
        )
                .setParameter("oib", entitet.getOib())
                .list();
        if (lista.size() > 0) {
            throw new Iznimka("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", unesite drugi OIB!");
        }

    }

    private void kontrolaOibBazaPromjeni() throws Iznimka {
        List<Operater> lista = session.createQuery(""
                + " from Operater o "
                + " where o.oib=:oib and o.id!=:id"
        )
                .setParameter("oib", entitet.getOib())
                .setParameter("id", entitet.getId())
                .list();
        if (lista.size() > 0) {
            throw new Iznimka("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", unesite drugi OIB!");
        }

    }

}
