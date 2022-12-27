package com.example.Final1;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Apple_Id")
	private Integer Apple_Id;
	
	@Column(name="Passcode")
	private String Passcode;
	
	public Integer getApple_Id() {
		return Apple_Id;
	}
	public void setMovieId(Integer Apple_Id) {
		this.Apple_Id =Apple_Id;
	}

	
	public String getPasscode() {
		return Passcode;
	}
	public void setPasscode(String Passcode) {
		this.Passcode = Passcode;
	}
	
	
}
