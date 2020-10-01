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
        kontrolaBrojUgovora();
    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {

    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    private void kontrolaBrojUgovora() throws Iznimka {
        if (entitet.getBrojugovora().isEmpty()) {
            throw new Iznimka("Broj ugovora ne smije biti prazan!");
        }

    }

}
