package com.shihuc.dbconn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.shihuc.dbconn.pojo.mongo.MongoUser;
import com.shihuc.dbconn.pojo.mysql.MysqlUser;
import com.shihuc.dbconn.service.mongo.MongoUserService;
import com.shihuc.dbconn.service.mysql.MysqlUserService;

/**
 * 
 * @author  shihuc
 * @date	Jan 29, 2016
 * 
 */
@SpringBootApplication
@PropertySource(value = "dbconn.properties")
public class DbConnApp 
{
	
   	public static void main(String[] args) throws Throwable {
      	
    	SpringApplication app = new SpringApplication(DbConnApp.class);
    	
		ApplicationContext ctx = app.run(args);		
		
		MysqlUserService mysqlUserService = (MysqlUserService)ctx.getBean("mysqlUserService");		
//		MysqlUser su = new MysqlUser("shihuc", "SW", 30 , "wuhan");
//		mysqlUserService.addUser(su);    
		MysqlUser ue = mysqlUserService.getUser(1);
		System.out.println("Mysql User: " + ue);		
		
		MongoUserService mongoUserService = (MongoUserService)ctx.getBean("mongoUserService");
//		MongoUser mu = new MongoUser("shihuc", "SW", 30 , "wuhan");
//		mongoUserService.addUser(mu);				
		MongoUser um = mongoUserService.getUser("shihuc");
		System.out.println("Mongo User: " + um);
    }
}
