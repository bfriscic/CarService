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

        Operater operater = (Operater) sesion.createQuery(
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
        kontrolaIme();

    }

    @Override
    protected void kontrolaUpdate() throws Iznimka {

    }

    @Override
    protected void kontrolaDelete() throws Iznimka {

    }

    @Override
    public List<Operater> getPodaci() {
        return sesion.createQuery("from Operater").list();
    }

}
