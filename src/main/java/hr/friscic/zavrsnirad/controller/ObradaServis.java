/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Servis;
import hr.friscic.zavrsnirad.utility.Iznimka;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author K1R4
 */
public class ObradaServis extends Obrada<Servis> {

    @Override
    public List<Servis> getPodaci() {
        return sesion.createQuery("from Servis").list();
    }

    @Override
    protected void kontrolaCreate() throws Iznimka {
        kontrolaCijena();
        kontrolaNaziv();
        kontrolaOpis();
    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {

    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    private void kontrolaCijena() throws Iznimka {
        if (entitet.getCijena() == null) {
            throw new Iznimka("Cijena nije definirana!");
        }
        if (entitet.getCijena().compareTo(BigDecimal.ZERO) <= 0) {
            throw new Iznimka("Cijena ne može biti manja ili jednaka nuli!");

        }
    }

    private void kontrolaNaziv() throws Iznimka {
        if (entitet.getNaziv() == null || entitet.getNaziv().isEmpty()) {
            throw new Iznimka("Naziv servisa je potrebno unijeti! Npr. veliki servis.");
        }
        if (!entitet.getNaziv().matches(("^[a-zA-ZÆÐƎƏƐƔĲŊŒẞÞǷȜæðǝəɛɣĳŋœĸſßþƿȝĄƁÇĐƊĘĦĮƘŁØƠŞȘŢȚŦŲƯY̨Ƴąɓçđɗęħįƙłøơşșţțŧųưy̨ƴÁÀÂÄǍĂĀÃÅǺĄÆǼǢƁĆĊĈČÇĎḌĐƊÐÉÈĖÊËĚĔĒĘẸƎƏƐĠĜǦĞĢƔáàâäǎăāãåǻąæǽǣɓćċĉčçďḍđɗðéèėêëěĕēęẹǝəɛġĝǧğģɣĤḤĦIÍÌİÎÏǏĬĪĨĮỊĲĴĶƘĹĻŁĽĿʼNŃN̈ŇÑŅŊÓÒÔÖǑŎŌÕŐỌØǾƠŒĥḥħıíìiîïǐĭīĩįịĳĵķƙĸĺļłľŀŉńn̈ňñņŋóòôöǒŏōõőọøǿơœŔŘŖŚŜŠŞȘṢẞŤŢṬŦÞÚÙÛÜǓŬŪŨŰŮŲỤƯẂẀŴẄǷÝỲŶŸȲỸƳŹŻŽẒŕřŗſśŝšşșṣßťţṭŧþúùûüǔŭūũűůųụưẃẁŵẅƿýỳŷÿȳỹƴźżžẓ\\s-,.\\']+$"))) {
            throw new Iznimka("Naziv servisa nije ispravan! Dozvoljen je unos samo slova.");
        }
        if (entitet.getNaziv().length() > 50) {
            throw new Iznimka("Naziv servisa ne može biti duži od 50 znakova!");
        }

    }

    private void kontrolaOpis() throws Iznimka {
        if (entitet.getOpis() == null || entitet.getOpis().isEmpty()) {
            throw new Iznimka("Opis servisa je potrebno unijeti!");
        }
        if (entitet.getOpis().length() > 250) {
            throw new Iznimka("Opis servisa ne može biti duži od 250 znakova!");
        }
    }

}
