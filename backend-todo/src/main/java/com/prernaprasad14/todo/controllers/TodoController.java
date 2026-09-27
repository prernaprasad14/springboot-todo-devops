package com.prernaprasad14.todo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prernaprasad14.todo.models.Todo;
import com.prernaprasad14.todo.services.TodoService;

import jakarta.validation.Valid;

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
    public ResponseEntity<Todo> saveTodo(@Valid @RequestBody Todo todoObject){
        Todo savedTodo = todoService.saveTodo(todoObject);
         return ResponseEntity.status(HttpStatus.CREATED)
                            .body(savedTodo);
     }
   
}
