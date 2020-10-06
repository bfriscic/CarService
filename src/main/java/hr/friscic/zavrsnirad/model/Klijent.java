/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Klasa Klijent se odnosi na klijente koji koriste usluge servisa.
 *
 * @author K1R4
 */
@Entity
public class Klijent extends Osoba {

    private String kontaktbroj;

    @OneToMany(mappedBy = "klijent")
    private List<Vozilo> vozila = new ArrayList<>();

    public String getKontaktbroj() {
        return kontaktbroj;
    }

    public void setKontaktbroj(String kontaktbroj) {
        this.kontaktbroj = kontaktbroj;
    }

    public List<Vozilo> getVozila() {
        return vozila;
    }

    public void setVozila(List<Vozilo> vozila) {
        this.vozila = vozila;
    }

    @Override
    public String toString() {
        return getImePrezime();
    }

}
