package org.isegodin.simple.messenger.backend.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;

/**
 * @author isegodin
 */
@PropertySource("org/isegodin/simple/messenger/backend/service/registry/application.properties")
@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryApp.class, args);
    }
}
