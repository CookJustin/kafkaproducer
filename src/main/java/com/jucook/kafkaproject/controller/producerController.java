package com.jucook.kafkaproject.controller;

import com.jucook.kafkaproject.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class producerController {
    @Autowired
    ProducerService producerService;

    @RequestMapping(value="/addTopic", method = RequestMethod.GET)
    public ResponseEntity<String> addTopic(){
        producerService.addTopic("aTopic");
        return new ResponseEntity<>("TopicAdded",HttpStatus.ACCEPTED);
    }

}
