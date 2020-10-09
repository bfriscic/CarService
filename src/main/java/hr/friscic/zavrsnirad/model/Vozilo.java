/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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

    @Enumerated(EnumType.STRING)
    private VrstaVozila vrstavozila;

    public static enum VrstaVozila {
        Automobil,
        Motocikl,
        Tegljač
    }

    @ManyToOne
    private Klijent klijent;

    @ManyToOne
    private Marka marka;

    @OneToMany(mappedBy = "vozilo")
    private List<Servis> servisi = new ArrayList<>();

    public List<Servis> getServisi() {
        return servisi;
    }

    public void setServisi(List<Servis> servisi) {
        this.servisi = servisi;
    }

    public VrstaVozila getVrstavozila() {
        return vrstavozila;
    }

    public void setVrstavozila(VrstaVozila vrstavozila) {
        this.vrstavozila = vrstavozila;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
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

    @Override
    public String toString() {
        return getVrstavozila() + " " + getMarka().getNaziv() + " " + getMarka().getModel() + " (" + getKlijent().getImePrezime() + ")";
    }

}
