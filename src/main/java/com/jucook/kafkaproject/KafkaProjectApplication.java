package com.jucook.kafkaproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProjectApplication {


    @Value("${yo}")
    private static String yo;
    public static void main(String[] args) {
        SpringApplication.run(KafkaProjectApplication.class, args);
        System.out.println("yo: " + yo);
    }


}
