package org.isegodin.simple.messenger.client.desktop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author i.segodin
 */
@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/test")
	public ResponseEntity<String> test() {
		return restTemplate.getForEntity("http://MESSAGING-SERVICE/service-instances/MESSAGING-SERVICE", String.class);
	}
}
