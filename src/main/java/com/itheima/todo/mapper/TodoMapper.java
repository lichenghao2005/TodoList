package com.itheima.todo.mapper;

import com.itheima.todo.entity.Todo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface TodoMapper {
    // 查询所有待办
    List<Todo> findAll();
    // 新增待办
    void add(Todo todo);
    // 标记完成
    void complete(Long id);
    // 删除待办
    void delete(Long id);
}
