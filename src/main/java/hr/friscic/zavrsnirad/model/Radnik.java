/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.model;

import javax.persistence.Entity;

/**
 * Klasa Radnik se odnosi na zaposlenika/cu koji/ja je zaposlena u servisu
 * motornih vozila i izvršava servis na određenom vozilu.
 *
 * @author K1R4
 */
@Entity
public class Radnik extends Osoba {

    private String brojugovora;

    public String getBrojugovora() {
        return brojugovora;
    }

    public void setBrojugovora(String brojugovora) {
        this.brojugovora = brojugovora;
    }

}
