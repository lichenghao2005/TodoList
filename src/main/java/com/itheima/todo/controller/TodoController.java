package com.itheima.todo.controller;

import com.itheima.todo.common.Result;
import com.itheima.todo.entity.Todo;
import com.itheima.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    // 查询所有待办
    @GetMapping
    public Result<List<Todo>> list() {
        return Result.success(todoService.list());
    }

    // 新增待办
    @PostMapping
    public Result<?> add(@RequestBody Todo todo) {
        todoService.add(todo);
        return Result.success();
    }

    // 标记完成
    @PutMapping("/{id}")
    public Result<?> complete(@PathVariable Long id) {
        todoService.complete(id);
        return Result.success();
    }

    // 删除待办
    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        todoService.delete(id);
        return Result.success();
    }
}
