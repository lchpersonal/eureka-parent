package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: chengli
 * @Date: 2018/12/15 17:41
 */
@SpringBootApplication
@EnableEurekaServer
public class Server7001 {
    public static void main(String[] args) {
        SpringApplication.run(Server7001.class, args);
    }
}
