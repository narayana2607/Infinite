package com.example.Final1;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	 @Autowired
	 private LoginService service;
	 
	 @PostMapping("/login/addlogins")
	 public void addSignin(@RequestBody Login login) {
		  service.addLogin(login);
	 }
	 @RequestMapping("/search/{Apple_Id}")
	  public Login show(@PathVariable int Apple_Id) {
			return service.searchLogin(Apple_Id);
	}
	
	@GetMapping("/")
	public List<Login> list() {
	    return service.showLogin();
	}
}
