package com.ownhttps.loadtesting;

import http.HTTPUtility;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication
public class LoadTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadTestingApplication.class, args);

	}

}
