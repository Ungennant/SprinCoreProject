package org.serf.project.lesson18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.serf.project.lesson18")
public class SimpleMvcAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleMvcAppApplication.class, args);
	}

}
