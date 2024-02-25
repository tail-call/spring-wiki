# Java Message Service

JMS (Java Message Service) - это стандартный API для работы с сообщениями в Java-приложениях. Он предоставляет единый способ для создания, отправки, получения и обработки сообщений между различными компонентами приложения, независимо от их расположения.

JMS поддерживает две модели обмена сообщениями:

1. **Point-to-Point (P2P)**: В этой модели сообщение отправляется от отправителя к конкретному получателю (одному из множества получателей). Каждое сообщение имеет только одного получателя. В этой модели используются очереди сообщений (queues).

2. **Publish/Subscribe (Pub/Sub)**: В этой модели сообщение отправляется от отправителя к множеству получателей, подписанных на определенную тему. Каждое сообщение может быть получено несколькими получателями. В этой модели используются темы сообщений (topics).

JMS API включает в себя различные интерфейсы и классы, такие как `ConnectionFactory` для установления соединения с JMS провайдером, `Destination` для представления точек отправки и получения сообщений (очереди или темы), `Session` для создания и управления сеансами обмена сообщениями, `MessageProducer` и `MessageConsumer` для отправки и получения сообщений и так далее.

Пример использования JMS для отправки и получения сообщений:

```java
import javax.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsExample {

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        
        try (Connection connection = connectionFactory.createConnection()) {
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Destination destination = session.createQueue("myQueue");
            MessageProducer producer = session.createProducer(destination);
            TextMessage message = session.createTextMessage("Hello, JMS!");
            producer.send(message);
            System.out.println("Message sent: " + message.getText());
            
            MessageConsumer consumer = session.createConsumer(destination);
            connection.start();
            TextMessage receivedMessage = (TextMessage) consumer.receive();
            System.out.println("Received message: " + receivedMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
```

В этом примере мы используем ActiveMQ в качестве JMS провайдера. Мы отправляем текстовое сообщение в очередь "myQueue" и затем получаем его из той же очереди.