package com.igame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ChanV
 * @create 2021-02-05-1:08
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class loginServer_8001 {
    public static void main(String[] args) {
        SpringApplication.run(loginServer_8001.class, args);
    }
}
