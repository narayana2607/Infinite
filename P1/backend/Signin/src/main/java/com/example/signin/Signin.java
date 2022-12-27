package com.example.signin;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Signin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Apple_Id")
	private Integer Apple_Id;
	
	@Column(name="Mobile_No")
	private String Mobile_No;
	
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
	public String getMobile_No() {
		return Mobile_No;
	}
	public void setMobile_No(String Mobile_No) {
		this.Mobile_No = Mobile_No;
	}
	
	
}
