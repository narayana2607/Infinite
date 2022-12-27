package com.example.signin;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SigninService {

	@Autowired
	SigninRepository repo;
	
	public List<Signin> showSignin() {
		return repo.findAll();
	}
	
	@Autowired
	private SignInDAO dao;
	
	public String authenticate(String user,String pwd) {
		return dao.authenticate(user, pwd);
	}
	public void addSignin(Signin signin) {
		repo.save(signin);
	}
	
	public Signin searchSignin(int Apple_Id) {
		return repo.findById(Apple_Id).get();
	}

	
}
