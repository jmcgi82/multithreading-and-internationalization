package edu.wgu.d387_sample_code.threads;

import java.util.Locale;
import java.util.ResourceBundle;

public class TranslateFr extends Thread {

    public void run() {
        Locale loc = new Locale("fr");
        ResourceBundle rb = ResourceBundle.getBundle("language.translate", loc);
        System.out.println("French: " + rb.getString("welcome"));
    }

}
