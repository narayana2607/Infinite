package com.example.signin;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SigninController {

	 @Autowired
	 private SigninService service;
	 @CrossOrigin(origins= "http://localhost:3000")
	 
	 @PostMapping("/signin/addsignins")
	 public void addSignin(@RequestBody Signin signin) {
		  service.addSignin(signin);
	 }
	 
	 @RequestMapping("/signInAuthenticate/{user}/{pwd}")
		public String autneticateion(@PathVariable String user, @PathVariable String pwd) {
			return service.authenticate(user, pwd);
		}
	 @RequestMapping("/search/{Apple_Id}")
	  public Signin show(@PathVariable int Apple_Id) {
			return service.searchSignin(Apple_Id);
	}
	 @CrossOrigin(origins= "http://localhost:3000")
	@GetMapping("/")
	public List<Signin> list() {
	    return service.showSignin();
	}
}
