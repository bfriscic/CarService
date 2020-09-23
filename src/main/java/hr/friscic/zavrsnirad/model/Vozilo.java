/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import java.time.LocalDateTime;
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

    private LocalDateTime godinaproizvodnje;
    private String boja;
    private String brojsasije;
    private String vrstavozila;

    @ManyToOne
    private Klijent klijent;

    @ManyToOne
    private Marka marka;

    public String getVrstavozila() {
        return vrstavozila;
    }

    public void setVrstavozila(String vrstavozila) {
        this.vrstavozila = vrstavozila;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public LocalDateTime getGodinaproizvodnje() {
        return godinaproizvodnje;
    }

    public void setGodinaproizvodnje(LocalDateTime godinaproizvodnje) {
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
