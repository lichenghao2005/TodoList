package com.itheima.todo.service.impl;

import com.itheima.todo.entity.Todo;
import com.itheima.todo.mapper.TodoMapper;
import com.itheima.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoMapper todoMapper;

    @Override
    public List<Todo> list() {
        return todoMapper.findAll();
    }

    @Override
    public void add(Todo todo) {
        todoMapper.add(todo);
    }

    @Override
    public void complete(Long id) {
        todoMapper.complete(id);
    }

    @Override
    public void delete(Long id) {
        todoMapper.delete(id);
    }
}