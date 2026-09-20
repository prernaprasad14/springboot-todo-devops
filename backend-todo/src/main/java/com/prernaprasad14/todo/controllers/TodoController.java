package com.prernaprasad14.todo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prernaprasad14.todo.models.Todo;
import com.prernaprasad14.todo.services.TodoService;

@RestController
public class TodoController {
    
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo")
    public Todo getTodo(){
        return new Todo("Learn SpringBoot", "Learn SpringBoot with Todo app", false);
    }

    @PostMapping("/todo")
    public Todo saveTodo(@RequestBody Todo todoObject){
        return todoService.saveTodo(todoObject);
    }
   
}
