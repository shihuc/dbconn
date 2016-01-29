package com.shihuc.dbconn.pojo.mysql;

import com.shihuc.dbconn.pojo.User;

public class MysqlUser extends User{

	private static final long serialVersionUID = -6412107575129572581L;

	//这个id是数据库中通过设置auto_increment得到的主键值
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public MysqlUser(){
		
	}
	
	public MysqlUser(String username, String job, int age, String hometown){
		this.username = username;
		this.job = job;
		this.age = age;
		this.hometown = hometown;
	}
	
}
