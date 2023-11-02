package edu.wgu.d387_sample_code.threads;

import java.util.Locale;
import java.util.ResourceBundle;

public class TranslateEn extends Thread {

    public void run() {
        Locale loc = new Locale("en");
        ResourceBundle rb = ResourceBundle.getBundle("language.translate", loc);
        System.out.println("English: " + rb.getString("welcome"));
    }

}
