/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Vrsta;
import hr.friscic.zavrsnirad.utility.Iznimka;

/**
 *
 * @author K1R4
 */
public class ObradaVrsta extends Obrada<Vrsta> {

    @Override
    protected void kontrolaCreate() throws Iznimka {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {

    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    private void kontrolaNaziv() throws Iznimka {
        if (entitet.getNaziv() == null || entitet.getNaziv().isEmpty()) {
            throw new Iznimka("Naziv vrste vozila je potrebno unijeti! Npr. automobil, motocikl ili tegljač.");
        }
        if (!entitet.getNaziv().matches(("[a-zA-Z]+"))) {
            throw new Iznimka("Naziv vrste vozila ne može sadržavati brojeve!");
        }

    }

}
