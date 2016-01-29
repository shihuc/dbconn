package com.shihuc.dbconn.service.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shihuc.dbconn.dao.mysql.IMysqlUser;
import com.shihuc.dbconn.pojo.mysql.MysqlUser;

@Service("mysqlUserService")
public class MysqlUserService {
	
	@Autowired
	private IMysqlUser mysqlUser; 
	
	public int addUser(MysqlUser userToAdd) {
		return mysqlUser.addUser(userToAdd);
	}

    public MysqlUser getUser(int userId) {
        return mysqlUser.getUser(userId);
    }
}
