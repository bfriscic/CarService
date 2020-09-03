/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *Klasa Servis se odnosi na vrstu usluge odnosno koja vrsta
 * servisa se odrađuje na vozilu.
 * @author K1R4
 */

@Entity
public class Servis extends Entitet {
    
    private String naziv;
    private String opis;
    private BigDecimal cijena;
    
    @ManyToOne
    private Vozilo vozilo;
    
    @ManyToOne
    private Radnik radnik;
    

}
