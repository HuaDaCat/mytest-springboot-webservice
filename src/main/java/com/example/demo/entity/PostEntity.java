package com.example.demo.entity;

public class PostEntity {
    private String from;
    private String to;
    private String content;

    public PostEntity() {
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return to;
    }

    public String getContent() {
        return content;
    }

    public void setFrom(String value) {
        this.from = value;
    }

    public void setTo(String value) {
        this.to = value;
    }

    public void setContent(String value) {
        this.content = value;
    }
}
