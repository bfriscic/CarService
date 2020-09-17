/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import javax.persistence.Entity;

/**
 * Klasa Klijent se odnosi na klijente koji koriste usluge servisa.
 *
 * @author K1R4
 */
@Entity
public class Klijent extends Osoba {

    private String kontaktbroj;

    public String getKontaktbroj() {
        return kontaktbroj;
    }

    public void setKontaktbroj(String kontaktbroj) {
        this.kontaktbroj = kontaktbroj;
    }

}
