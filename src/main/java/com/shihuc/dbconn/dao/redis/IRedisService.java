package com.shihuc.dbconn.dao.redis;

/**
 * Created by chengsh05 on 2017/7/19.
 */
public interface IRedisService {

    public boolean putValue(String key, Object value, long expireTime);

    public Object getValue(String key);
}
