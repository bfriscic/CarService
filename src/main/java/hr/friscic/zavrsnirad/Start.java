/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad;

import hr.friscic.zavrsnirad.utility.HibernateUtil;
import hr.friscic.zavrsnirad.utility.PocetniInsert;
import hr.friscic.zavrsnirad.view.Autorizacija;
import hr.friscic.zavrsnirad.view.Izbornik;

/**
 *
 * @author K1R4
 */
public class Start {

    public static void main(String[] args) {
        
        //new Autorizacija().setVisible(true);
        
        //HibernateUtil.getSessionFactory().openSession();

        PocetniInsert.izvedi();
    }

}
