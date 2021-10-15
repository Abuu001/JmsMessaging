package io.lugonzo.jmsmessaging;

import io.lugonzo.jmsmessaging.services.jms.Sender;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

@EnableJms
@SpringBootApplication
public class JmsMessagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsMessagingApplication.class, args);

		/*ConfigurableApplicationContext context = SpringApplication.run(JmsMessagingApplication.class, args);
		Sender sender =context.getBean(Sender.class);

		sender.sendMessage("order-queue","Hahaha");*/
	}


}
