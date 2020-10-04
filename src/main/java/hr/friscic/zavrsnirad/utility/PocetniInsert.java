/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.utility;

import com.github.javafaker.Faker;
import hr.friscic.zavrsnirad.controller.ObradaOperater;
import hr.friscic.zavrsnirad.model.Klijent;
import hr.friscic.zavrsnirad.model.Operater;
import hr.friscic.zavrsnirad.model.Radnik;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author K1R4
 */
public class PocetniInsert {

    public static void izvedi() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Operater operater = new Operater();
        operater.setIme("Bernard");
        operater.setPrezime("Friščić");
        operater.setOib(Oib.getOibIiCentrala());
        operater.setUloga("oper");
        operater.setEmail("bernard.friscic@gmail.com");
        operater.setLozinka(BCrypt.hashpw("b", BCrypt.gensalt()));

        ObradaOperater oo = new ObradaOperater();

        oo.setEntitet(operater);

        try {
            oo.create();
        } catch (Iznimka ex) {
            ex.printStackTrace();
        }

        session.beginTransaction();

        Faker faker = new Faker();

        String[] kontaktBrojevi = {"0957894356", "0995698147", "0925698753", "0979684523",
            "0915869456", "0916003551", "0993658796", "0954562389",
            "0927568453", "0953487635"};

        Klijent k;
        for (int i = 0; i < 10; i++) {
            k = new Klijent();
            k.setIme((faker.name().firstName()));
            k.setPrezime(faker.name().lastName());
            k.setOib(Oib.getOibIiCentrala());
            k.setEmail(k.getIme().toLowerCase() + "." + k.getPrezime().toLowerCase() + "@gmail.com");
            k.setKontaktbroj(kontaktBrojevi[i]);
            session.save(k);
        }
        session.getTransaction().commit();
    }

    public static void adminOperater() {

        Operater operater = new Operater();
        operater.setIme("SMV");
        operater.setPrezime("Operater");
        operater.setUloga("admin");
        operater.setOib(Oib.getOibIiCentrala());
        operater.setEmail("smv@smv.com");
        operater.setLozinka(BCrypt.hashpw("s", BCrypt.gensalt()));

        ObradaOperater oo = new ObradaOperater();

        oo.setEntitet(operater);

        try {
            oo.create();
        } catch (Iznimka ex) {
            ex.printStackTrace();
        }

    }

    public static void radnici() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Faker faker = new Faker();

        Radnik r;
        for (int i = 0; i < 10; i++) {
            r = new Radnik();
            r.setIme((faker.name().firstName()));
            r.setPrezime(faker.name().lastName());
            r.setOib(Oib.getOibIiCentrala());
            r.setEmail(r.getIme().toLowerCase() + "." + r.getPrezime().toLowerCase() + "@gmail.com");
            r.setBrojugovora(faker.number().digits(10));
            session.save(r);
        }
        session.getTransaction().commit();

    }

}
