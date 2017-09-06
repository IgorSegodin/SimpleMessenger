package org.isegodin.simple.messenger.client.desktop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

/**
 * @author isegodin
 */
@PropertySource("org/isegodin/simple/messenger/client/desktop/application.properties")
@SpringBootApplication
@EnableDiscoveryClient
public class DesktopClientApp {

    public static void main(String[] args) {
//		new SpringApplicationBuilder(DesktopClientApp.class)
//				.web(WebApplicationType.NONE)
//				.run(args);
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DesktopClientApp.class, args);
    }

	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
