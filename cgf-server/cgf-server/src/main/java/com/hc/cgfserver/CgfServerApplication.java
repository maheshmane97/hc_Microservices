package com.hc.cgfserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CgfServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CgfServerApplication.class, args);
	}

}
