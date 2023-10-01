package com.todo.schema;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document(collection = "Todo")
public class Todo {
    @Id
    String id;
    String title;
    LocalDate date;
    String info;
    String ownerId;

    public Todo(String title , LocalDate date , String info , String ownerId){
        this.title = title;
        this.date = date;
        this.info = info;
        this.ownerId = ownerId;
    }
    public String getId(){
        return this.id;
    }
    public String getOwnerId(){
        return this.ownerId;
    }
}
