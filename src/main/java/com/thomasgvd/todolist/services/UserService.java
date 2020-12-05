package com.thomasgvd.todolist.services;

import com.thomasgvd.todolist.models.MyUser;
import com.thomasgvd.todolist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public MyUser findUser(String userName) {
        return userRepository.findByUserName(userName).orElseThrow(() -> new UsernameNotFoundException("User not found."));
    }

}
