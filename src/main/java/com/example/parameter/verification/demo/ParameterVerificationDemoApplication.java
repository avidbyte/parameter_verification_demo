package com.example.parameter.verification.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author aaron
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ParameterVerificationDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParameterVerificationDemoApplication.class, args);
    }

}
