package com.thomasgvd.todolist.services;

import com.thomasgvd.todolist.models.MyUserDetails;
import com.thomasgvd.todolist.models.MyUser;
import com.thomasgvd.todolist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        MyUser user = userRepository.findByUserName(userName)
                .orElseThrow(() -> new UsernameNotFoundException("User not found."));

        return new MyUserDetails(user);
    }
}
