package com.qf;

import com.alibaba.fastjson.JSON;
import com.qf.dao.user.TLogMapper;
import com.qf.user.po.user.TLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

//消息监听者
@Service
public class MsgListener implements MessageListener{
    @Autowired
    private TLogMapper tLogMapper;
    @Override
    public void onMessage(Message message) {
        try {
            String json=((TextMessage)message).getText();
            TLog tLog = JSON.parseObject(json, TLog.class);
            tLogMapper.insert(tLog);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
