package com.bo;

public class UserSignup {
	private String name;
	private String email;
	private String Password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public UserSignup(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		Password = password;
	}
}
