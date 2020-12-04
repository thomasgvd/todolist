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
    UserRepository userRepository;
    @Autowired
    TaskRepository taskRepository;

    public MyTask createTask(int userId) {
        MyUser user = userRepository.findById(userId).orElseThrow(() -> new UsernameNotFoundException("User not found."));
        return taskRepository.save(new MyTask(user));
    }
}