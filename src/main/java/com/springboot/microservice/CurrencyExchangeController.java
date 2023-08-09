package com.springboot.microservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/ria-exchange")
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;
	@Autowired
	private CurrencyExchangeRepo repo;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeVal(@PathVariable String from, @PathVariable String to) {

		CurrencyExchange exchange = repo.findByFromAndTo(from, to);
		if (exchange == null)
			throw new RuntimeException("No Data found From and To");

		exchange.setEnvironment(environment.getProperty("local.server.port"));

		return exchange;
	}
}
