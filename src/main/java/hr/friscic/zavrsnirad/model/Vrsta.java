/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import javax.persistence.Entity;

/**
 *Klasa Vrsta se odnosi na vrstu vozila odnosno da li je to
 * osobni automobil, motocikl ili teretno vozilo.
 * @author K1R4
 */

@Entity
public class Vrsta extends Entitet{
    
    private String naziv;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    
    
}
