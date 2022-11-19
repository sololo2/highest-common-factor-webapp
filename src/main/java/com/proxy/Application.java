package com.proxy;

import com.proxy.service.HighestCommonFactorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Bean
    public HighestCommonFactorService getHighestCommonFactorService(){
        return new HighestCommonFactorService();
    }

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
