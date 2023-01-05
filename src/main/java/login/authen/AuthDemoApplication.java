package login.authen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class AuthDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthDemoApplication.class, args);
	}

}
