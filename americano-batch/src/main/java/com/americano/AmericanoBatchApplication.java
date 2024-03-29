package com.americano;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by gavinkim at 2019-03-17
 */
@EnableBatchProcessing
@SpringBootApplication
public class AmericanoBatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(AmericanoBatchApplication.class, args);
    }
}
