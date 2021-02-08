package com.igame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ChanV
 * @create 2021-02-07-15:43
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ManagementServer_8004 {
    public static void main(String[] args) {
        SpringApplication.run(ManagementServer_8004.class, args);
    }
}
