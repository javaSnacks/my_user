package com.slw.my_user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.slw.my_user.dao")
@EnableEurekaClient
@EnableDiscoveryClient
//@AutoConfigurationPackage
public class MyUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyUserApplication.class, args);
	}

}
