package com.todo.controller;

import com.todo.api.TodoService;
import com.todo.schema.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping("/todo")
    public String saveTodo(@RequestBody Todo todo){
        return todoService.saveTodo(todo);
    }

    @GetMapping("/todo/user/{id}")
    public List<Todo> getUserTodos(@PathVariable String id){
        return todoService.getTodosByUserId(id);
    }
    @DeleteMapping("/todo/{id}")
    public String deleteTodo(@PathVariable String id){
        return todoService.deleteTodo(id);
    }
}
