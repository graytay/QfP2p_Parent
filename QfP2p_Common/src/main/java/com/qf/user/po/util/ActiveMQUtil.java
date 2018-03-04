package com.qf.user.po.util;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class ActiveMQUtil {
    private String username;
    private String password;
    private String url;
    public ActiveMQUtil(){
        username= ActiveMQConnection.DEFAULT_USER;
        password=ActiveMQConnection.DEFAULT_PASSWORD;
        url="tcp://10.0.127.179:61616";
    }
    //发送P2P消息
    public void sendMsg(String queueName,String json) throws JMSException {
        //创建连接工厂
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(username, password, url);
        //开始连接配对
        Connection connection = factory.createConnection();
        //开始
        connection.start();
        //获取会话
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //创建存储消息的对象
        Queue queue = session.createQueue(queueName);
        //创建消息的提供者
        MessageProducer producer = session.createProducer(queue);
        //发送消息
        producer.send(session.createTextMessage(json));
        //关闭
        session.close();
        connection.close();
    }
    //发送发布与订阅消息
    public void sengMsgByPub(String topicName,String json) throws JMSException {
        //创建连接工厂
        ConnectionFactory factory=new ActiveMQConnectionFactory(username,password,url);
        //获取连接对
        Connection connection=factory.createConnection();
        //开始
        connection.start();
        //获取会话
        Session session=connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        //创建存储消息的对象
        Topic topic=session.createTopic(topicName);
        //创建消息提供者
        MessageProducer producer=session.createProducer(topic);
        //发送消息
        producer.send(session.createTextMessage(json));
        //关闭
        session.close();
        connection.close();
    }
}
