package com.thomasgvd.todolist.controllers;

import com.thomasgvd.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/users/{userId}/tasks")
    public String postTask(@PathVariable(name = "userId") int userId) {
        taskService.createTask(userId);
        return "redirect:/";
    }

    @DeleteMapping("/tasks/{taskId}/delete")
    public String deleteTask(@PathVariable(name="taskId") int taskId) {
        taskService.deleteTask(taskId);
        return "redirect:/";
    }
}
