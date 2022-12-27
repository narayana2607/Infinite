package com.example.Final1;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LoginService {

	@Autowired
	LoginRepository repo;
	
	public List<Login> showLogin() {
		return repo.findAll();
	}
	

	public void addLogin(Login login) {
		repo.save(login);
	}
	
	public Login searchLogin(int Apple_Id) {
		return repo.findById(Apple_Id).get();
	}

	
}
