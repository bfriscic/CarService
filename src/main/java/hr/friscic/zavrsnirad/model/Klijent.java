/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import javax.persistence.Entity;

/**
 *Klasa Klijent se odnosi na klijente koji koriste usluge servisa.
 * @author K1R4
 */

@Entity
public class Klijent extends Entitet {
    
    private String ime;
    private String prezime;
    private String oib;
    private String kontaktbroj;
    private String email;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getKontaktbroj() {
        return kontaktbroj;
    }

    public void setKontaktbroj(String kontaktbroj) {
        this.kontaktbroj = kontaktbroj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
