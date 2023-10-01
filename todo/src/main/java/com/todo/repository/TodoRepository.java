package com.todo.repository;

import com.todo.schema.Todo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {
    public List<Todo> findByOwnerId(String ownerId);
}