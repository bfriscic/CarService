/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad;

import hr.friscic.zavrsnirad.utility.HibernateUtil;
import hr.friscic.zavrsnirad.utility.PocetniInsert;

/**
 *
 * @author K1R4
 */
public class Start {

    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory().openSession();
        PocetniInsert.izvedi();
    }

}
