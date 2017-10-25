package org.revo.hokng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HokngApplication {

	public static void main(String[] args) {
		SpringApplication.run(HokngApplication.class, args);
	}

	@GetMapping("/")
	public String hi() {
		return "hi";
	}
}
