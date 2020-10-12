/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.model.Operater;
import hr.friscic.zavrsnirad.utility.Iznimka;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author K1R4
 */
public class ObradaOperater extends ObradaOsoba<Operater> {

    public Operater autoriziraj(String email, char[] lozinka) {

        Operater operater = (Operater) session.createQuery(
                "from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();

        if (operater == null) {
            return null;
        }

        return BCrypt.checkpw(new String(lozinka), operater.getLozinka())
                ? operater : null;
    }

    @Override
    protected void kontrolaCreate() throws Iznimka {
        super.kontrolaCreate();
        kontrolaUloga();
        kontrolaLozinka();

    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {
        super.kontrolaUpdate();
    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    @Override
    public List<Operater> getPodaci() {
        return session.createQuery("from Operater").list();
    }

    private void kontrolaUloga() throws Iznimka {
        if (entitet.getUloga() == null) {
            throw new Iznimka("Uloga je obavezna, ne može biti prazna!");
        }

    }

    private void kontrolaLozinka() throws Iznimka {
        if (entitet.getLozinka().isEmpty() || entitet.getLozinka() == null) {
            throw new Iznimka("Lozinka je obavezna, ne može biti prazna!");
        }
    }

}
