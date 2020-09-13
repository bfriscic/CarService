/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.testiranje;

import hr.friscic.zavrsnirad.controller.ObradaKlijent;
import hr.friscic.zavrsnirad.model.Klijent;
import hr.friscic.zavrsnirad.utility.Iznimka;

/**
 *
 * @author K1R4
 */
public class TestObradeKlijenta {
    
    public static void main(String[] args) {
        
        Klijent k = new Klijent();
        
        ObradaKlijent obradaKlijent = new ObradaKlijent(k);
        k.setIme("Pero");
        k.setPrezime("");
        k.setOib("4999");
        k.setEmail("test@test.com");
        k.setKontaktbroj("0951234567");
        
        
        
        try {
            obradaKlijent.create();
        } catch (Iznimka e) {
            System.out.println(e.getPoruka());
        }
    }
    
}
