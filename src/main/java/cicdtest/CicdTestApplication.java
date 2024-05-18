package cicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController("/")
public class CicdTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdTestApplication.class, args);
	}
	@GetMapping
	public String getMsg() {
		return "Hi.......";
	}

}
