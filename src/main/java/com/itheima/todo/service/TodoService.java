package com.itheima.todo.service;

import com.itheima.todo.entity.Todo;
import java.util.List;

public interface TodoService {
    List<Todo> list();
    void add(Todo todo);
    void complete(Long id);
    void delete(Long id);
}