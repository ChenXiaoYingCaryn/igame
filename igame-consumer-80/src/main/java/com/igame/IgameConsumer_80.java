package com.igame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ChanV
 * @create 2021-02-04-22:22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.igame"})
public class IgameConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(IgameConsumer_80.class, args);
    }
}
