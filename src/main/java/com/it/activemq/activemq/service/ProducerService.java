package com.it.activemq.activemq.service;

import javax.jms.Destination;

/**
 * 功能描述：生产消息
 */
public interface ProducerService {

    /**
     * 功能描述：指定消息队列，还有消息
     * @param destination
     * @param message
     */
    public void sendMessage(Destination destination, final String message);

    /**
     * 功能描述：使用默认消息队列，发送消息
     * @param message
     */
    public void sendMessage(final String message);
}
