import com.anikasystems.api.dto.Store;
import com.anikasystems.api.producer.StoreMessageProducer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.jms.core.JmsTemplate;
import static org.mockito.Mockito.verify;

public class StoreMessageProducerTest {

    @Mock
    private JmsTemplate jmsTemplate;

    private StoreMessageProducer storeMessageProducer;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        storeMessageProducer = new StoreMessageProducer();
        storeMessageProducer.setJmsTemplate(jmsTemplate);
    }

    @Test
    public void testSendTo() {
        String destination = "testDestination";
        Store store = new Store();

        storeMessageProducer.sendTo(destination, store);

        verify(jmsTemplate).convertAndSend(destination, store);
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 5;
        int b = 10;
        int expectedSum = 15;

        // Act
        int actualSum = storeMessageProducer.add(a, b);

        // Assert
        assertEquals(expectedSum, actualSum);
    }
}
