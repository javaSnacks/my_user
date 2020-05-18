package com.slw.my_user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.slw.my_user.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class MyUserApplication {

	public static void main(String[] args) {
        System.out.println(1);
		SpringApplication.run(MyUserApplication.class, args);
        System.out.println(3);
	}

}
