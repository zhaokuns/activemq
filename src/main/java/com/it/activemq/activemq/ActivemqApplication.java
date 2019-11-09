package com.it.activemq.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

@SpringBootApplication
@EnableJms
public class ActivemqApplication {

	@Bean
	//交给spring进行管理，方便以后的注入
	public Queue queue(){
		return new ActiveMQQueue("common.queue");
	}

	public static void main(String[] args) {
		SpringApplication.run(ActivemqApplication.class, args);
	}

}
