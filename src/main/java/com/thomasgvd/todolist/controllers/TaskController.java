package com.thomasgvd.todolist.controllers;

import com.thomasgvd.todolist.models.MyTask;
import com.thomasgvd.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/api/users/{userId}/tasks")
    public MyTask postTask(@PathVariable(name = "userId") int userId) {
        return taskService.createTask(userId);
    }
}
