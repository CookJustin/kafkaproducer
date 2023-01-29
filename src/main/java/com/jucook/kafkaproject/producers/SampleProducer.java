package com.jucook.kafkaproject.producers;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Value;

import java.util.Properties;

public class SampleProducer {
    @Value("${kafka.broker.host}")
    private String KAFKA_BROKER_HOST;
    private String KAFKA_BROKER_PORT = "9092";
    public SampleProducer(){
        Properties properties = new Properties();
        properties.put("bootstrap.servers", KAFKA_BROKER_HOST + KAFKA_BROKER_PORT);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        //we need to create a producer record to send to kafka
        ProducerRecord producerRecord = new ProducerRecord("channel","name","ourtopic");

        KafkaProducer kafkaProducer = new KafkaProducer(properties);

        kafkaProducer.send(producerRecord);
        kafkaProducer.close();
    }
}
