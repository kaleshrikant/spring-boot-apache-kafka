package com.spring.boot.cabbookdriver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.spring.boot.cabbookdriver.constant.AppConstant.CAB_LOCATION;

@Configuration
public class KafkaConfig {

    public NewTopic topic(){
        return TopicBuilder
                .name(CAB_LOCATION)
                .build();
    }

}
