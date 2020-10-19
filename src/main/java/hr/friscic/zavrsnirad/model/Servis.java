/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Klasa Servis se odnosi na vrstu usluge odnosno koja vrsta servisa se odrađuje
 * na vozilu.
 *
 * @author K1R4
 */
@Entity
public class Servis extends Entitet {

    private String naziv;
    private String opis;
    private BigDecimal cijena;
    private Date termin;
    private Boolean odraden;

    @ManyToOne
    private Vozilo vozilo;

    @ManyToOne
    private Radnik radnik;

    public Date getTermin() {
        return termin;
    }

    public void setTermin(Date termin) {
        this.termin = termin;
    }

    public Boolean getOdraden() {
        return odraden;
    }

    public void setOdraden(Boolean odraden) {
        this.odraden = odraden;
    }
    
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Vozilo getVozilo() {
        return vozilo;
    }

    public void setVozilo(Vozilo vozilo) {
        this.vozilo = vozilo;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    @Override
    public String toString() {
        return "[" + getNaziv()+ "]" + " " + getVozilo();
    }
    
    

}
