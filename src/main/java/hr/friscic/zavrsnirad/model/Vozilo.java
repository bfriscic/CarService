/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Klasa Vozilo se odnosi na vozilo koje je potrebno servisirati.
 *
 * @author K1R4
 */
@Entity
public class Vozilo extends Entitet {

    private Date godinaproizvodnje;
    private String boja;
    private String brojsasije;

    @ManyToOne
    private Klijent klijent;

    @ManyToOne
    private Marka marka;

    @ManyToOne
    private Vrsta vrsta;

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public Vrsta getVrsta() {
        return vrsta;
    }

    public void setVrsta(Vrsta vrsta) {
        this.vrsta = vrsta;
    }

    public Date getGodinaproizvodnje() {
        return godinaproizvodnje;
    }

    public void setGodinaproizvodnje(Date godinaproizvodnje) {
        this.godinaproizvodnje = godinaproizvodnje;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public String getBrojsasije() {
        return brojsasije;
    }

    public void setBrojsasije(String brojsasije) {
        this.brojsasije = brojsasije;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

}
