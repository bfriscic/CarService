/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Vozilo;
import hr.friscic.zavrsnirad.utility.Iznimka;
import java.util.List;

/**
 *
 * @author K1R4
 */
public class ObradaVozilo extends Obrada<Vozilo> {

    @Override
    public List<Vozilo> getPodaci() {
        return session.createQuery("from Vozilo").list();
    }

    @Override
    protected void kontrolaCreate() throws Iznimka {
        kontrolaBoja();
        kontrolaBrojSasije();
        kontrolaDatumProizvodnje();
        kontrolaVrstaVozila();
        kontrolaKlijentOdabran();
        kontrolaMarkaOdabran();
        kontrolaVrstaVozilaOdabran();
    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {
        kontrolaBoja();
        kontrolaBrojSasije();
        kontrolaDatumProizvodnje();
        kontrolaVrstaVozila();
    }

    @Override
    protected void kontrolaDelete() throws Iznimka {
        if (entitet.getServisi().size() > 0) {
            throw new Iznimka("Vozilo se ne može obrisati jer ima jedno ili više servisa u tijeku!");
        }
    }

    private void kontrolaBoja() throws Iznimka {
        if (entitet.getBoja() == null || entitet.getBoja().isEmpty()) {
            throw new Iznimka("Potrebno je unijeti boju vozila!");
        }
        if (!entitet.getBoja().matches(("^[a-zA-ZÆÐƎƏƐƔĲŊŒẞÞǷȜæðǝəɛɣĳŋœĸſßþƿȝĄƁÇĐƊĘĦĮƘŁØƠŞȘŢȚŦŲƯY̨Ƴąɓçđɗęħįƙłøơşșţțŧųưy̨ƴÁÀÂÄǍĂĀÃÅǺĄÆǼǢƁĆĊĈČÇĎḌĐƊÐÉÈĖÊËĚĔĒĘẸƎƏƐĠĜǦĞĢƔáàâäǎăāãåǻąæǽǣɓćċĉčçďḍđɗðéèėêëěĕēęẹǝəɛġĝǧğģɣĤḤĦIÍÌİÎÏǏĬĪĨĮỊĲĴĶƘĹĻŁĽĿʼNŃN̈ŇÑŅŊÓÒÔÖǑŎŌÕŐỌØǾƠŒĥḥħıíìiîïǐĭīĩįịĳĵķƙĸĺļłľŀŉńn̈ňñņŋóòôöǒŏōõőọøǿơœŔŘŖŚŜŠŞȘṢẞŤŢṬŦÞÚÙÛÜǓŬŪŨŰŮŲỤƯẂẀŴẄǷÝỲŶŸȲỸƳŹŻŽẒŕřŗſśŝšşșṣßťţṭŧþúùûüǔŭūũűůųụưẃẁŵẅƿýỳŷÿȳỹƴźżžẓ\\s-,.\\']+$"))) {
            throw new Iznimka("Boja vozila nije ispravna! Dozvoljen je unos samo slova.");
        }
    }

    private void kontrolaBrojSasije() throws Iznimka {
        if (entitet.getBrojsasije() == null || entitet.getBrojsasije().isEmpty()) {
            throw new Iznimka("Potrebno je unijeti broj šasije!");
        }

    }

    private void kontrolaDatumProizvodnje() throws Iznimka {
        if (entitet.getDatumproizvodnje() == null) {
            throw new Iznimka("Potrebno je unijeti godinu proizvodnje vozila!");
        }
    }

    private void kontrolaVrstaVozila() throws Iznimka {
        if (entitet.getVrstavozila() == null) {
            throw new Iznimka("Vrstu vozila je potrebno odabrati!");
        }

    }
    private void kontrolaVrstaVozilaOdabran() throws Iznimka {
        if (entitet.getVrstavozila()== null) {
            throw new Iznimka("Potrebno je odabrati vrstu vozila iz padajućeg izbornika!");
        }
    }
    
    private void kontrolaKlijentOdabran() throws Iznimka {
        if (entitet.getKlijent() == null) {
            throw new Iznimka("Potrebno je odabrati klijenta iz padajućeg izbornika!");
        }
    }
    
    private void kontrolaMarkaOdabran() throws Iznimka {
        if (entitet.getMarka()== null) {
            throw new Iznimka("Potrebno je odabrati marku iz padajućeg izbornika!");
        }
    }

}
