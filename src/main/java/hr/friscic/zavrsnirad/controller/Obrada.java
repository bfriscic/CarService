/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.controller;

import hr.friscic.zavrsnirad.utility.HibernateUtil;
import hr.friscic.zavrsnirad.utility.Iznimka;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author K1R4
 */
public abstract class Obrada<T> {

    protected T entitet;
    protected Session sesion;

    protected abstract void kontrolaCreate() throws Iznimka;

    protected abstract void kontrolaUpdate() throws Iznimka;

    protected abstract void kontrolaDelete() throws Iznimka;

    public Obrada(T entitet) {
        this();
        this.entitet = entitet;
    }

    public Obrada() {
        this.sesion = HibernateUtil.getSessionFactory().openSession();
    }

    public T create() throws Iznimka {
        kontrolaCreate();
        save();
        return entitet;
    }

    public T update() throws Iznimka {
        kontrolaUpdate();
        save();
        return entitet;

    }

    public boolean delete() throws Iznimka {
        kontrolaDelete();
        sesion.beginTransaction();
        sesion.delete(entitet);
        sesion.getTransaction().commit();
        return true;
    }

    private void save() {
        sesion.beginTransaction();
        sesion.save(entitet);
        sesion.getTransaction().commit();
    }

}