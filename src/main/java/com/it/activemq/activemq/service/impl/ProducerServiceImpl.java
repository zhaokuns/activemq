package com.it.activemq.activemq.service.impl;

import com.it.activemq.activemq.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Queue;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;  //用来发送到broker的对象

    @Autowired
    private Queue queue;

    //发送消息，destination是发送到的队列，message是待发送的消息
    @Override
    public void sendMessage(Destination destination, String message) {
        jmsMessagingTemplate.convertAndSend(destination,message);
    }

    //发送消息，destination是发送到的队列，message是待发送的消息
    @Override
    public void sendMessage(String message) {
        jmsMessagingTemplate.convertAndSend(message);
    }
}
