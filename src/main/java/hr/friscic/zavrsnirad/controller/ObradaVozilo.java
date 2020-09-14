/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Vozilo;
import hr.friscic.zavrsnirad.utility.Iznimka;

/**
 *
 * @author K1R4
 */
public class ObradaVozilo extends Obrada<Vozilo> {

    @Override
    protected void kontrolaCreate() throws Iznimka {
        kontrolaBoja();
        kontrolaBrojSasije();
        kontrolaGodinaProizvodnje();
    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {

    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    private void kontrolaBoja() throws Iznimka {
        if (entitet.getBoja() == null || entitet.getBoja().isEmpty()) {
            throw new Iznimka("Potrebno je unijeti boju vozila!");
        }
        if(!entitet.getBoja().matches(("^[a-zA-ZÆÐƎƏƐƔĲŊŒẞÞǷȜæðǝəɛɣĳŋœĸſßþƿȝĄƁÇĐƊĘĦĮƘŁØƠŞȘŢȚŦŲƯY̨Ƴąɓçđɗęħįƙłøơşșţțŧųưy̨ƴÁÀÂÄǍĂĀÃÅǺĄÆǼǢƁĆĊĈČÇĎḌĐƊÐÉÈĖÊËĚĔĒĘẸƎƏƐĠĜǦĞĢƔáàâäǎăāãåǻąæǽǣɓćċĉčçďḍđɗðéèėêëěĕēęẹǝəɛġĝǧğģɣĤḤĦIÍÌİÎÏǏĬĪĨĮỊĲĴĶƘĹĻŁĽĿʼNŃN̈ŇÑŅŊÓÒÔÖǑŎŌÕŐỌØǾƠŒĥḥħıíìiîïǐĭīĩįịĳĵķƙĸĺļłľŀŉńn̈ňñņŋóòôöǒŏōõőọøǿơœŔŘŖŚŜŠŞȘṢẞŤŢṬŦÞÚÙÛÜǓŬŪŨŰŮŲỤƯẂẀŴẄǷÝỲŶŸȲỸƳŹŻŽẒŕřŗſśŝšşșṣßťţṭŧþúùûüǔŭūũűůųụưẃẁŵẅƿýỳŷÿȳỹƴźżžẓ\\s-,.\\']+$"))) {
            throw new Iznimka("Boja vozila nije ispravna! Dozvoljen je unos samo slova.");
        }
    }

    private void kontrolaBrojSasije() throws Iznimka{
        if(entitet.getBrojsasije() ==null || entitet.getBrojsasije().isEmpty()) {
            throw new Iznimka("Potrebno je unijeti broj šasije!");
        }
        
    }

    private void kontrolaGodinaProizvodnje() throws Iznimka {
        if(entitet.getGodinaproizvodnje()==null){
            throw new Iznimka("Potrebno je unijeti datum! Format unosa je dd/mm/yyyy");
        }
    }

}
