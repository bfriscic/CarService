/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Operater;
import hr.friscic.zavrsnirad.utility.Iznimka;
import java.util.List;

/**
 *
 * @author K1R4
 */
public class ObradaOperater extends ObradaOsoba<Operater> {

    @Override
    protected void kontrolaCreate() throws Iznimka {
        kontrolaIme();

    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {

    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    @Override
    public List<Operater> getPodaci() {
        return sesion.createQuery("from Operater").list();
    }

}
