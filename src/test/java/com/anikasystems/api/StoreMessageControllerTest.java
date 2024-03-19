package com.anikasystems.api;

import com.anikasystems.api.controller.StoreMessageController;
import com.anikasystems.api.dto.Store;
import com.anikasystems.api.producer.StoreMessageProducer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.jms.core.JmsTemplate;

import static org.mockito.Mockito.*;

public class StoreMessageControllerTest {

    private StoreMessageController storeMessageController;

    @Mock
    private JmsTemplate jmsTemplate;

    @Mock
    private StoreMessageProducer storeMessageProducer;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        storeMessageController = new StoreMessageController(jmsTemplate, storeMessageProducer);
    }

    @Test
    public void testPublishMessage() {
        Store store = new Store();
        storeMessageController.publishMessage(store);
        verify(storeMessageProducer).sendTo(anyString(), eq(store));
    }
}
