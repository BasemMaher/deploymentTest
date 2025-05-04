package com.basem.deploymentTest.Grating.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "messages") // استخدم الاسم بحروف صغيرة كما هو في DB
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // لو id auto increment
    private int id;

    @Column(name = "message_content") // الاسم الصحيح للعمود
    private String messageContent;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
}