package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.threads.TimeThread;
import edu.wgu.d387_sample_code.threads.TranslateEn;
import edu.wgu.d387_sample_code.threads.TranslateFr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {

		SpringApplication.run(D387SampleCodeApplication.class, args);
		//Some formatting code to make it easier to read in console
		System.out.println("\n\nMultithreaded Resource Bundle output:");
		System.out.print("-----------------------------------------");

		//Start english thread
		TranslateEn transEn = new TranslateEn();
		transEn.start();

		//formatting code
		System.out.println("\n");

		//Start french thread
		TranslateFr transFr = new TranslateFr();
		transFr.start();

		//formatting code


		//Start time thread
		TimeThread timeThread = new TimeThread();
		timeThread.start();
	}

}
