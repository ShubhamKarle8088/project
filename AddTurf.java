package com.bo;

public class AddTurf {
	private int id;
	private String Ground_Name;
	private String Ground_email;
	private String Ground_capacity;
	private String Ground_address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGround_Name() {
		return Ground_Name;
	}
	public void setGround_Name(String ground_Name) {
		Ground_Name = ground_Name;
	}
	public String getGround_email() {
		return Ground_email;
	}
	public void setGround_email(String ground_email) {
		Ground_email = ground_email;
	}
	public String getGround_capacity() {
		return Ground_capacity;
	}
	public void setGround_capacity(String ground_capacity) {
		Ground_capacity = ground_capacity;
	}
	public String getGround_address() {
		return Ground_address;
	}
	public void setGround_address(String ground_address) {
		Ground_address = ground_address;
	}
	public AddTurf(int id, String ground_Name, String ground_email, String ground_capacity, String ground_address) {
		super();
		this.id = id;
		Ground_Name = ground_Name;
		Ground_email = ground_email;
		Ground_capacity = ground_capacity;
		Ground_address = ground_address;
	}
	public AddTurf() {
		// TODO Auto-generated constructor stub
	}
	
	

}
