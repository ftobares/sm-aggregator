package ar.com.ftobares.backendsm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"ar.com.ftobares.backendsm"})
public class BackendAddApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendAddApplication.class, args);
	}
}
