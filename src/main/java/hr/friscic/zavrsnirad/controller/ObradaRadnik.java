/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Radnik;
import hr.friscic.zavrsnirad.utility.Iznimka;
import java.util.List;

/**
 *
 * @author K1R4
 */
public class ObradaRadnik extends ObradaOsoba<Radnik> {

    @Override
    public List<Radnik> getPodaci() {
        return session.createQuery("from Radnik").list();
    }

    @Override
    protected void kontrolaCreate() throws Iznimka {
        super.kontrolaCreate();
        kontrolaOibBazaKreiraj();
        kontrolaBrojUgovora();
    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {
        super.kontrolaUpdate();
        kontrolaOibBazaPromjeni();
        kontrolaBrojUgovora();
    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    private void kontrolaBrojUgovora() throws Iznimka {
        if (entitet.getBrojugovora().isEmpty()) {
            throw new Iznimka("Broj ugovora ne smije biti prazan!");
        }

    }

    private void kontrolaOibBazaKreiraj() throws Iznimka {
        List<Radnik> lista = session.createQuery(""
                + " from Radnik r "
                + " where r.oib=:oib "
        )
                .setParameter("oib", entitet.getOib())
                .list();
        if (lista.size() > 0) {
            throw new Iznimka("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", unesite drugi OIB!");
        }

    }

    private void kontrolaOibBazaPromjeni() throws Iznimka {
        List<Radnik> lista = session.createQuery(""
                + " from Radnik r "
                + " where r.oib=:oib and r.id!=:id"
        )
                .setParameter("oib", entitet.getOib())
                .setParameter("id", entitet.getId())
                .list();
        if (lista.size() > 0) {
            throw new Iznimka("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", unesite drugi OIB!");
        }

    }

}
