package com.map.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableAdminServer
public class MapAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapAdminServerApplication.class,args);
    }
}
