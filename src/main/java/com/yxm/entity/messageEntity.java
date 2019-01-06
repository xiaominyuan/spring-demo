package com.yxm.entity;

public class messageEntity {
    private String messageID;
    private String messageVideoID;
    private String messageUserID;
    private String messageName;
    private String message;
    private String messageTime;
    private String messageHead;

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getMessageVideoID() {
        return messageVideoID;
    }

    public void setMessageVideoID(String messageVideoID) {
        this.messageVideoID = messageVideoID;
    }

    public String getMessageUserID() {
        return messageUserID;
    }

    public void setMessageUserID(String messageUserID) {
        this.messageUserID = messageUserID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessageHead() {
        return messageHead;
    }

    public void setMessageHead(String messageHead) {
        this.messageHead = messageHead;
    }
}
