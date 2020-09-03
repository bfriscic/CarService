/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import javax.persistence.Entity;

/**
 *Klasa Radnik se odnosi na zaposlenika/cu koji/ja je zaposlena u servisu
 * motornih vozila i izvršava servis na određenom vozilu.
 * @author K1R4
 */

@Entity
public class Radnik extends Entitet{
    
    private String ime;
    private String prezime;
    private String oib;
    private String kontaktbroj;
    private String email;
    private String brojugovora;

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

    public String getBrojugovora() {
        return brojugovora;
    }

    public void setBrojugovora(String brojugovora) {
        this.brojugovora = brojugovora;
    }
    
    
    
    
    
}
