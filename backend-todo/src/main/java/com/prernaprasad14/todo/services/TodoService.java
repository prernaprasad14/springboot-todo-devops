package com.prernaprasad14.todo.services;

import org.springframework.stereotype.Service;

import com.prernaprasad14.todo.models.Todo;

@Service 
public class TodoService {
    public Todo saveTodo(Todo todoObject) throws IllegalArgumentException{
        return todoObject;
    }
}
 