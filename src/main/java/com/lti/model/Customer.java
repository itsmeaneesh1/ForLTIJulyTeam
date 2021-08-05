package com.lti.model;

public class Customer {
	
	private String custid;
	private String name;
	private String city;
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Customer(String custid, String name, String city) {
		super();
		this.custid = custid;
		this.name = name;
		this.city = city;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
