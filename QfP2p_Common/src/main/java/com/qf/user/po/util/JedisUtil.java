package com.qf.user.po.util;

import redis.clients.jedis.Jedis;

public class JedisUtil {
    private Jedis jedis;
    public JedisUtil(){

        jedis=new Jedis("47.94.160.40",6379);
        jedis.auth("Xy199207");
    }
    public void addHash(String key,String field,String value){
        jedis.hset(key,field,value);
    }
    public String getStr(String key){
       return jedis.get(key);
    }
    public boolean isHave(String key){
        return jedis.exists(key);
    }
    public void addstr(String key,String value,int epx){
        jedis.set(key,value);
        jedis.expire(key,epx);
    }
}
