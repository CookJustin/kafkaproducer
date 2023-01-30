package com.jucook.kafkaproject.service;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class ProducerService {
    @Value("${kafka.broker.host}")
    private String kafka_broker_host;
    public void addTopic(String topic){
        Properties properties = new Properties();
        properties.put("bootstrap.servers", kafka_broker_host + ":9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        System.out.println(kafka_broker_host);
        //we need to create a producer record to send to kafka
//        if(kafka_broker_host != null){
//            ProducerRecord producerRecord = new ProducerRecord("channel","name",topic);
//
//            KafkaProducer kafkaProducer = new KafkaProducer(properties);
//
//            kafkaProducer.send(producerRecord);
//            kafkaProducer.close();
//        }
    }
}
