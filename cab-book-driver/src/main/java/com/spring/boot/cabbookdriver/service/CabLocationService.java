package com.spring.boot.cabbookdriver.service;

import com.spring.boot.cabbookdriver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.spring.boot.cabbookdriver.constant.AppConstant.CAB_LOCATION;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public boolean updateLocation(String location) {
        // publishing to kafka topic
        kafkaTemplate.send(CAB_LOCATION,location);
        return Boolean.TRUE;
    }

}
