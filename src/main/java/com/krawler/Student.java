package com.krawler;

public class Student {
	
	String id;
	String uname;
	String food;
	
	public Student(String id, String uname, String food) {
		super();
		this.id = id;
		this.uname = uname;
		this.food = food;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", uname=" + uname + ", food=" + food + "]";
	}	
	
}
