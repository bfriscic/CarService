/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad;

import com.formdev.flatlaf.FlatDarkLaf;
import hr.friscic.zavrsnirad.view.SplashScreen;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author K1R4
 */
public class Start {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Greška prilikom pokretanja LaF-a!");
        }

        new SplashScreen().setVisible(true);
        JFrame.setDefaultLookAndFeelDecorated(true);

        //HibernateUtil.getSessionFactory().openSession();
        //PocetniInsert.izvedi();
        //PocetniInsert.adminOperater();
        //PocetniInsert.radnici();
    }

}
