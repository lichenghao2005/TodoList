package com.itheima.todo.entity;

public class Todo {
    private Long id;
    private String content;
    private Integer completed;

    // 无参构造
    public Todo() {}

    // getter/setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public Integer getCompleted() { return completed; }
    public void setCompleted(Integer completed) { this.completed = completed; }
}