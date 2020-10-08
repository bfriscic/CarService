/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.utility;

import java.net.URL;
import java.util.Scanner;
import org.jsoup.Jsoup;
import us.codecraft.xsoup.Xsoup;

/**
 *
 * @author K1R4
 */
public class Oib {

    public static boolean provjeraOib(String oib) {

        if (oib.length() != 11) {
            return false;
        }

        try {
            Long.parseLong(oib);
        } catch (NumberFormatException e) {
            return false;
        }

        int a = 10;
        for (int i = 0; i < 10; i++) {
            a = a + Integer.parseInt(oib.substring(i, i + 1));
            a = a % 10;
            if (a == 0) {
                a = 10;
            }
            a *= 2;
            a = a % 11;
        }
        int kontrolni = 11 - a;
        if (kontrolni == 10) {
            kontrolni = 0;
        }
        return kontrolni == Integer.parseInt(oib.substring(10));
    }

    public static String getOibIiCentrala() {
        try {
            String html = new Scanner(new URL("http://oib.itcentrala.com/oib-generator/").openStream(), "UTF-8").useDelimiter("\\A").next();

            org.jsoup.nodes.Document document = Jsoup.parse(html);
            return Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(document).get();
        } catch (Exception e) {
            return null;
        }
    }

}
