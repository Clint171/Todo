package com.todo.schema;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {
    @Id
    String id;
    String email;
    String password;

    public User(String email , String password){
        this.email = email;
        this.password = password;
    }
    public String getId(){
        return this.id;
    }
    public String getEmail(){
        return this.email;
    }
}
