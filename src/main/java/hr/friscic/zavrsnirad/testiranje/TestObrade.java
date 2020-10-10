/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.testiranje;

import hr.friscic.zavrsnirad.controller.ObradaKlijent;
import hr.friscic.zavrsnirad.controller.ObradaMarka;
import hr.friscic.zavrsnirad.controller.ObradaOsoba;
import hr.friscic.zavrsnirad.controller.ObradaVozilo;
import hr.friscic.zavrsnirad.model.Klijent;
import hr.friscic.zavrsnirad.model.Marka;
import hr.friscic.zavrsnirad.model.Osoba;
import hr.friscic.zavrsnirad.model.Vozilo;
import hr.friscic.zavrsnirad.utility.Iznimka;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author K1R4
 */
public class TestObrade {

    public static void main(String[] args) {

//        Klijent k = new Klijent();
//
//        k.setIme("Perica333");
//        k.setPrezime("Perić1");
//        k.setOib("4999");
//        k.setEmail("test@test.com");
//        k.setKontaktbroj("0951234567");
//
//        ObradaKlijent obradaK = new ObradaKlijent();
//
//        obradaK.setEntitet(k);
//
//        try {
//            obradaK.create();
//        } catch (Iznimka e) {
//            System.out.println(e.getPoruka());
//        }
//        Marka m = new Marka();
//        
//        m.setModel("Ford");
//        m.setNaziv("Focus");
//        
//        ObradaMarka obradaM = new ObradaMarka();
//        
//        obradaM.setEntitet(m);
//        
//        try {
//            obradaM.create();
//        } catch (Iznimka e) {
//            System.out.println(e.getPoruka());
//        }
//        Vrsta v = new Vrsta();
//        
//        v.setNaziv("automobil");
//        
//        ObradaVrsta obradaV = new ObradaVrsta();
//        
//        obradaV.setEntitet(v);
//        
//        try {
//            obradaV.create();
//        } catch (Iznimka e) {
//            System.out.println(e.getPoruka());
//        }
        Vozilo w = new Vozilo();

        w.setBoja("bijela");
        w.setBrojsasije("1FT7W2BT9CEA54193");
        w.setDatumproizvodnje(Date.from(Instant.MIN));

        ObradaVozilo obradaW = new ObradaVozilo();

        obradaW.setEntitet(w);

        try {
            obradaW.create();
        } catch (Iznimka e) {
            System.out.println(e.getPoruka());
        }

    }

}
