package com.thomasgvd.todolist.services;

import com.thomasgvd.todolist.models.MyTask;
import com.thomasgvd.todolist.models.MyUser;
import com.thomasgvd.todolist.repositories.TaskRepository;
import com.thomasgvd.todolist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TaskRepository taskRepository;

    public MyTask createTask(int userId) {
        MyUser user = userRepository.findById(userId).orElseThrow(() -> new UsernameNotFoundException("User not found."));
        return taskRepository.save(new MyTask(user));
    }

    public void deleteTask(int taskId) {
        MyTask task = taskRepository.findById(taskId).orElseThrow(() -> new UsernameNotFoundException("Task not found."));
        taskRepository.delete(task);
    }

    public MyTask getTask(int taskId) {
        return taskRepository.findById(taskId).orElseThrow(() -> new UsernameNotFoundException("Task not found."));
    }

    public MyTask updateTask(MyTask task) {
        return taskRepository.save(task);
    }
}
