package com.example.myapplication2;

public class Email {
    private  String subject;
    private  String body;
    private  String sender;

    public String getSenderProfile() {
        return senderProfile;
    }

    public void setSenderProfile(String senderProfile) {
        this.senderProfile = senderProfile;
    }

    private  String senderProfile;
    private  long time;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

}
