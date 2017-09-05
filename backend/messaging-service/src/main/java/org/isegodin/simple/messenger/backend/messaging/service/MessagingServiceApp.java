package org.isegodin.simple.messenger.backend.messaging.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;

/**
 * @author isegodin
 */
@PropertySource("org/isegodin/simple/messenger/backend/messaging/service/application.properties")
@EnableDiscoveryClient
@SpringBootApplication
public class MessagingServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(MessagingServiceApp.class, args);
    }
}
