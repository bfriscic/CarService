/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Klijent;
import hr.friscic.zavrsnirad.utility.Iznimka;
import hr.friscic.zavrsnirad.utility.Oib;
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
        kontrolaKontaktBroj();

    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {

    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    private void kontrolaKontaktBroj() throws Iznimka {
        if (entitet.getKontaktbroj().isEmpty()) {
            throw new Iznimka("Kontakt broj ne smije biti prazan!");
        }
        if (!entitet.getKontaktbroj().matches("[0-9]+")) {
            throw new Iznimka("Kontakt broj nije valjan!");
        }
    }

    @Override
    public List<Klijent> getPodaci() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
