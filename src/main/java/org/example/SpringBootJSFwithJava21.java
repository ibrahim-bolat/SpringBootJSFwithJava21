package org.example;

import org.example.config.JsfInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringBootJSFwithJava21 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJSFwithJava21.class, args);
    }

    @Bean
    public ServletContextInitializer facesInitializer() {
        return new JsfInitializer();
    }
}
