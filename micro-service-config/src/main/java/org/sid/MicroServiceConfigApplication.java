package org.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class MicroServiceConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceConfigApplication.class, args);
	}

}
