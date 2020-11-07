package cn.wt.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.ArrayList;

@Component
public class SpringMQ_Consumer {
    @Autowired
    private JmsTemplate jmsTemplate;

    public String getMessage() {
        //ArrayList<String> messageList = new ArrayList<>();
        String receiveAndConvert = (String) jmsTemplate.receiveAndConvert();
        return receiveAndConvert;
    }
}



