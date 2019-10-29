package com.infiniteloops.currencyexchangerateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CurrencyExchangeRatesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeRatesServiceApplication.class, args);
	}

}
