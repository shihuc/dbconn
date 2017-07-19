package com.shihuc.dbconn.sourceconfig.redis;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by chengsh05 on 2017/7/14.
 */
@Configuration
public class RedisConfig {

    private static Logger logger = Logger.getLogger(RedisConfig.class);

    @Bean
    @ConfigurationProperties(prefix="redis")
    public JedisPoolConfig getRedisConfig(){
        JedisPoolConfig config = new JedisPoolConfig();
        return config;
    }

    @Bean
    @ConfigurationProperties(prefix="redis")
    public JedisConnectionFactory getConnectionFactory(){
        JedisConnectionFactory factory = new JedisConnectionFactory();
        JedisPoolConfig config = getRedisConfig();
        factory.setPoolConfig(config);
        logger.info("JedisConnectionFactory bean init success.");
        return factory;
    }

    @Bean
    public RedisTemplate<String, Object> getRedisTemplate(){
        //RedisTemplate template = new StringRedisTemplate(getConnectionFactory());
        RedisTemplate<String,Object> template = new RedisTemplate<String, Object>();
        template.setConnectionFactory(getConnectionFactory());
        return template;
    }
}