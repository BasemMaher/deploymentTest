package com.basem.deploymentTest.Grating.Service;

import com.basem.deploymentTest.Grating.Model.Message;
import com.basem.deploymentTest.Grating.Repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreatingService {

    @Autowired
    private MessageRepository messageRepository;

    public String sayHello() {
        Message message = messageRepository.findById(1).orElse(null);
        return (message != null) ? message.getMessageContent() : "Message not found!";
    }
}

