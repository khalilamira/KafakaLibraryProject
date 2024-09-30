package tn.amira.kafkalibraryinventor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class KafkaLibraryInventorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KafkaLibraryInventorApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello");
	}
}
