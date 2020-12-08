package com.thomasgvd.todolist.controllers;

import com.thomasgvd.todolist.models.MyTask;
import com.thomasgvd.todolist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/users/{userId}/tasks")
    public String postTask(@PathVariable(name = "userId") int userId, Model model) {
        MyTask task = taskService.createTask(userId);
        model.addAttribute("task", task);
        return "task-form";
    }

    @DeleteMapping("/tasks/{taskId}/delete")
    public String deleteTask(@PathVariable(name="taskId") int taskId) {
        taskService.deleteTask(taskId);
        return "redirect:/";
    }

    @GetMapping("/tasks/{taskId}/form")
    public String taskForm(@PathVariable(name="taskId") int taskId, Model model) {
        model.addAttribute("task", taskService.getTask(taskId));
        return "task-form";
    }

    @PutMapping("/tasks/update")
    public String updateTask(MyTask task) {
        taskService.updateTask(task);
        return "redirect:/";
    }

}
