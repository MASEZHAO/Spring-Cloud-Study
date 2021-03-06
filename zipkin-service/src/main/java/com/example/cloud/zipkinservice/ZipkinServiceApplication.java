package com.example.cloud.zipkinservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ZipkinServiceApplication {

	private static Logger logger = LoggerFactory.getLogger(ZipkinServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServiceApplication.class, args);
	}
}
