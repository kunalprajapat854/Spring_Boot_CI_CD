package in.kunal;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCiCdApplication.class, args);
	}
	
	@GetMapping("/")
	public String getMessage() {
		return "Spring Boot";
	}

}
