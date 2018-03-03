package com.qf.user.po.util;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class ActiveMQUtil {
    private String username;
    private String password;
    private String url;
    public ActiveMQUtil(){
        username= ActiveMQConnection.DEFAULT_USER;
        password=ActiveMQConnection.DEFAULT_PASSWORD;
        url="tcp://10.0.127.179:61616";
    }
    public void sendMsg(String queueName,String json){
        //创建连接工厂
        new ActiveMQConnectionFactory()
    }
}
