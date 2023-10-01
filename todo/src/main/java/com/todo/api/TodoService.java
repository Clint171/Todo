package com.todo.api;

import com.todo.repository.TodoRepository;
import com.todo.schema.Todo;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // ...

    public String saveTodo(Todo todo) {
        todoRepository.save(todo);
        return todo.getId();
    }
    public List<Todo> getTodosByUserId(String id){
        return todoRepository.findByOwnerId(id);
    }
    public String deleteTodo(String id){
        todoRepository.deleteById(id);
        return id;
    }
}

