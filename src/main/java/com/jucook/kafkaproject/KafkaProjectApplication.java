package com.jucook.kafkaproject;

import com.jucook.kafkaproject.producers.SampleProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProjectApplication.class, args);
        SampleProducer sampleProducer = new SampleProducer();
    }

}
