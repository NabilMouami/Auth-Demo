package login.authen.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/")
public class AppController {
	
	
	@GetMapping
	public String testApp() {
		return "Hello Spring Security!";
	}

}
