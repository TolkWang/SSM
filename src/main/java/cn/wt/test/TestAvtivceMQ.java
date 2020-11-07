package cn.wt.test;

//import org.apache.activemq.ActiveMQConnectionFactory;
//import org.junit.Test;
//
//import javax.jms.*;
//import java.io.IOException;

public class TestAvtivceMQ {

//    public static final String ACTIVEMQ_URL = "tcp://192.168.91.130:61617";
//    public static final String QUEUE_NAME = "queue01";
//    public static final String TOPIC_NAME = "topic01";
//
//    //消息生产者 队列
//    @Test
//    public void run() throws JMSException {
//
//        //创建连接工厂
//        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
//        Connection connection = activeMQConnectionFactory.createConnection();
//        connection.start();
//        //创建会话
//        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//        //创建目的地
//        Queue queue = session.createQueue(QUEUE_NAME);
//
//
//        //创建消息的生产者
//        MessageProducer producer = session.createProducer(queue);
//        for (int i = 1; i <=3 ; i++) {
//            //创建消息
//            TextMessage textMessage = session.createTextMessage("msg-------" + i);
//            //通过MessageProducer发送给mq
//            producer.send(textMessage);
//        }
//        //关闭资源
//        producer.close();
//        session.close();
//        connection.close();
//
//        System.out.println("消息发布完成");
//    }
//
//    //消息消费者 队列
//    @Test
//    public void run2() throws JMSException, IOException {
//        //创建连接工厂
//        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
//        Connection connection = activeMQConnectionFactory.createConnection();
//        connection.start();
//        //创建会话
//        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//        //创建目的地
//        Queue queue = session.createQueue(QUEUE_NAME);
//
//        //创建消息消费者
//        MessageConsumer consumer = session.createConsumer(queue);
//
////        while (true) {
////
////            TextMessage textMessage = (TextMessage) consumer.receive();
////            if(null != textMessage) {
////                System.out.println("消费者接受消息:"+ textMessage.getText());
////            } else {
////                break;
////            }
////        }
//
//
//        //通过监听的方式来消费消息
//        consumer.setMessageListener(new MessageListener() {
//            @Override
//            public void onMessage(Message message) {
//                if(null != message && message instanceof TextMessage) {
//                    TextMessage textMessage = (TextMessage) message;
//                    try {
//                        System.out.println("消费者接受消息:"+ textMessage.getText());
//                    } catch (JMSException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//
//        System.in.read();
//        //关闭资源
//        consumer.close();
//        session.close();
//        connection.close();
//    }
//
//    //消息生产者 主题
//    @Test
//    public void run3() throws JMSException {
//
//        //创建连接工厂
//        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
//        Connection connection = activeMQConnectionFactory.createConnection();
//        connection.start();
//        //创建会话
//        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//        //创建目的地
//        //Queue queue = session.createQueue(QUEUE_NAME);
//        Topic topic = session.createTopic(TOPIC_NAME);
//        //创建消息的生产者
//        MessageProducer producer = session.createProducer(topic);
//        for (int i = 1; i <=3 ; i++) {
//            //创建消息
//            TextMessage textMessage = session.createTextMessage("msg-------" + i);
//            //通过MessageProducer发送给mq
//            producer.send(textMessage);
//        }
//        //关闭资源
//        producer.close();
//        session.close();
//        connection.close();
//
//        System.out.println("消息发布完成");
//    }
//
//    //消息消费者 消费者
//    @Test
//    public void run4() throws JMSException, IOException {
//        //创建连接工厂
//        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
//        Connection connection = activeMQConnectionFactory.createConnection();
//        connection.start();
//        //创建会话
//        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//        //创建目的地
//        Topic topic = session.createTopic(TOPIC_NAME);
//
//        //创建消息消费者
//        MessageConsumer consumer = session.createConsumer(topic);
//
//        //通过监听的方式来消费消息
//        consumer.setMessageListener(message -> {
//            if(null != message && message instanceof TextMessage) {
//                TextMessage textMessage = (TextMessage) message;
//                try {
//                    System.out.println("消费者接受消息:"+ textMessage.getText());
//                } catch (JMSException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        System.in.read();
//        //关闭资源
//        consumer.close();
//        session.close();
//        connection.close();
//    }
}
