package com.shihuc.dbconn.pojo.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import com.shihuc.dbconn.pojo.User;

@Document(collection = "user")
@CompoundIndexes(
		@CompoundIndex(name = "username", def = "{ username : 1}"))
public class MongoUser extends User{

	private static final long serialVersionUID = 4495390935587105239L;
	
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public MongoUser(String username, String job, int age, String hometown){
		this.username = username;
		this.job = job;
		this.age = age;
		this.hometown = hometown;
	}
}
