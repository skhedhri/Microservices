package org.sid.ref;

import org.sid.ref.Dao.*;
import org.sid.ref.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
public class    RefApplication implements CommandLineRunner {

    public static void main(String[] args) {
      //  SpringApplication.run(RefApplication.class, args);
        SpringApplication app = new SpringApplication(RefApplication.class);
        app.setApplicationStartup(new BufferingApplicationStartup(2048));
        app.run(args);
    }
    @Override
    public void run(String... args) throws Exception {

    }
}
