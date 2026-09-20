package com.prernaprasad14.todo.models;

public class Todo {
    private String title;
    private String description;

    private boolean isComplete;

    public Todo(String title, String description, boolean isComplete){
        this.title=title;
        this.description=description;
        this.isComplete=isComplete;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDescription(){
        return this.description;

    }

    public boolean isComplete(){
        return this.isComplete;

    }
}
