package com.springboot.microservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchange, Long >{
	
	CurrencyExchange findByFromAndTo(String from , String to);

}
