package com.kafka.learning.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    private final KafkaTemplate<String, String> template;

    public KafkaProducer(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    public void send(String toSend) {
        LOGGER.info(String.format("Msg sent : %s", toSend));
        this.template.send("topic1", toSend);
    }
}
