package com.springboot.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import io.github.resilience4j.retry.annotation.Retry;
//@RestController
public class CircuitBreakerController {

	/*private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

@GetMapping("/sample-api")
@Retry(name="sample-api",fallbackMethod="TestMethod")
public String getSampleApi(){
	
	logger.info("request to circuit breaker -----");
	ResponseEntity<String> responseEntity;
	try {
		responseEntity = new RestTemplate().
				getForEntity("http://localhost:8080/test1111", String.class);
	} catch (Exception | RestClientException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	
	

}

public String TestMethod(Exception e){
	
	return "Default response";
}*/

}

