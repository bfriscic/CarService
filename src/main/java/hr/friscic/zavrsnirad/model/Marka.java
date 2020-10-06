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
 * Klasa Marka se odnosi na marku vozila poput Audi,Volvo,Man,Ducati itd.
 *
 * @author K1R4
 */
@Entity
public class Marka extends Entitet {

    private String naziv;
    private String model;

    @OneToMany(mappedBy = "marka")
    private List<Vozilo> vozila = new ArrayList<>();

    public List<Vozilo> getVozila() {
        return vozila;
    }

    public void setVozila(List<Vozilo> vozila) {
        this.vozila = vozila;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return getNaziv() + " " + getModel();
    }

}
