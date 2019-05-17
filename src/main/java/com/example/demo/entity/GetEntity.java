package com.example.demo.entity;

/**
 * 定义一个请求后响应的对象
 */
public class GetEntity {
    private Long id;
    private String content;

    public GetEntity(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }
}
