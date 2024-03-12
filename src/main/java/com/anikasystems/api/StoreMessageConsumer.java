package com.anikasystems.api.consumer;

import com.anikasystems.api.dto.Store;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StoreMessageConsumer {

    /**
     * Message Listener of ActiveMQ queue
     * @param store
     */
    @JmsListener(destination = "${activemq.destination}", containerFactory = "jmsFactory")
    public void processToDo(Store store) {
        log.info("Consumer> " + store);
    }
}