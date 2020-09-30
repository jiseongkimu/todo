package com.todolist.voldemot.repo;

import com.todolist.voldemot.model.TodoItem;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
}
