/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Marka;
import hr.friscic.zavrsnirad.utility.Iznimka;

/**
 *
 * @author K1R4
 */
public class ObradaMarka extends Obrada<Marka> {

    @Override
    protected void kontrolaCreate() throws Iznimka {
        kontrolaModel();
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {

    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    private void kontrolaModel() throws Iznimka {
        if (entitet.getModel() == null || entitet.getModel().isEmpty()) {
            throw new Iznimka("Model je obavezan! Npr. Focus ili Golf.");
        }
    }

    private void kontrolaNaziv() throws Iznimka {
        if (entitet.getNaziv() == null || entitet.getNaziv().isEmpty()) {
            throw new Iznimka("Naziv marke je potrebno unijeti! Npr. Ford ili Volkswagen.");
        }
        if (!entitet.getNaziv().matches(("[a-zA-Z]+"))) {
            throw new Iznimka("Naziv marke ne može sadržavati brojeve!");

        }

    }

}
