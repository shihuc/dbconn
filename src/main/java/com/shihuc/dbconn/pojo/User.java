package com.shihuc.dbconn.pojo;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = -8787161389589498425L;
	
	public String username;
	
	public String job;
	
	public int age;
	
	public String hometown;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	@Override
	public String toString(){
		return " Username: " + this.username + 
			   " Job: " + this.job + 
			   " Age: " + this.age + 
			   " Hometown: " + this.hometown;
	}
}
