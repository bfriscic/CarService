/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Osoba;
import hr.friscic.zavrsnirad.utility.Iznimka;
import hr.friscic.zavrsnirad.utility.Oib;

/**
 *
 * @author K1R4
 * @param <T>
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {

    @Override
    protected void kontrolaCreate() throws Iznimka {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOib();
        kontrolaEmail();
    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOib();
        kontrolaEmail();
    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    protected void kontrolaIme() throws Iznimka {
        if (entitet.getIme().isEmpty() || entitet.getIme() == null) {
            throw new Iznimka("Ime je obavezno, ne može biti prazno!");
        }
        if (!entitet.getIme().matches(("^[a-zA-ZÆÐƎƏƐƔĲŊŒẞÞǷȜæðǝəɛɣĳŋœĸſßþƿȝĄƁÇĐƊĘĦĮƘŁØƠŞȘŢȚŦŲƯY̨Ƴąɓçđɗęħįƙłøơşșţțŧųưy̨ƴÁÀÂÄǍĂĀÃÅǺĄÆǼǢƁĆĊĈČÇĎḌĐƊÐÉÈĖÊËĚĔĒĘẸƎƏƐĠĜǦĞĢƔáàâäǎăāãåǻąæǽǣɓćċĉčçďḍđɗðéèėêëěĕēęẹǝəɛġĝǧğģɣĤḤĦIÍÌİÎÏǏĬĪĨĮỊĲĴĶƘĹĻŁĽĿʼNŃN̈ŇÑŅŊÓÒÔÖǑŎŌÕŐỌØǾƠŒĥḥħıíìiîïǐĭīĩįịĳĵķƙĸĺļłľŀŉńn̈ňñņŋóòôöǒŏōõőọøǿơœŔŘŖŚŜŠŞȘṢẞŤŢṬŦÞÚÙÛÜǓŬŪŨŰŮŲỤƯẂẀŴẄǷÝỲŶŸȲỸƳŹŻŽẒŕřŗſśŝšşșṣßťţṭŧþúùûüǔŭūũűůųụưẃẁŵẅƿýỳŷÿȳỹƴźżžẓ\\s-,.\\']+$"))) {
            throw new Iznimka("Ime nije ispravno! Dozvoljen je unos samo slova.");
        }
    }

    protected void kontrolaPrezime() throws Iznimka {
        if (entitet.getPrezime().isEmpty() || entitet.getPrezime() == null) {
            throw new Iznimka("Prezime je obavezno, ne može biti prazno!");
        }
        if (!entitet.getPrezime().matches(("^[a-zA-ZÆÐƎƏƐƔĲŊŒẞÞǷȜæðǝəɛɣĳŋœĸſßþƿȝĄƁÇĐƊĘĦĮƘŁØƠŞȘŢȚŦŲƯY̨Ƴąɓçđɗęħįƙłøơşșţțŧųưy̨ƴÁÀÂÄǍĂĀÃÅǺĄÆǼǢƁĆĊĈČÇĎḌĐƊÐÉÈĖÊËĚĔĒĘẸƎƏƐĠĜǦĞĢƔáàâäǎăāãåǻąæǽǣɓćċĉčçďḍđɗðéèėêëěĕēęẹǝəɛġĝǧğģɣĤḤĦIÍÌİÎÏǏĬĪĨĮỊĲĴĶƘĹĻŁĽĿʼNŃN̈ŇÑŅŊÓÒÔÖǑŎŌÕŐỌØǾƠŒĥḥħıíìiîïǐĭīĩįịĳĵķƙĸĺļłľŀŉńn̈ňñņŋóòôöǒŏōõőọøǿơœŔŘŖŚŜŠŞȘṢẞŤŢṬŦÞÚÙÛÜǓŬŪŨŰŮŲỤƯẂẀŴẄǷÝỲŶŸȲỸƳŹŻŽẒŕřŗſśŝšşșṣßťţṭŧþúùûüǔŭūũűůųụưẃẁŵẅƿýỳŷÿȳỹƴźżžẓ\\s-,.\\']+$"))) {
            throw new Iznimka("Prezime nije ispravno! Dozvoljen je unos samo slova.");
        }

    }

    protected void kontrolaOib() throws Iznimka {
        if (entitet.getOib() == null) {

        } else if (!Oib.provjeraOib(entitet.getOib())) {
            throw new Iznimka("Neispravan unos OIB-a!");
        }
    }

    protected void kontrolaEmail() throws Iznimka {

        if (entitet.getEmail().isEmpty()) {
            throw new Iznimka("Email ne smije biti prazan!");
        }
        if (entitet.getEmail().length() >= 50) {
            throw new Iznimka("Email nije valjan!");
        }

    }

}
