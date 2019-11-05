package com.flakesoup.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 */
@EnableConfigServer
@SpringCloudApplication
public class FlakeSoupConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlakeSoupConfigApplication.class, args);
	}
}
