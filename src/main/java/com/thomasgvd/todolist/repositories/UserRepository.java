package com.thomasgvd.todolist.repositories;

import com.thomasgvd.todolist.models.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Integer> {
    Optional<MyUser> findByUserName(String userName);
}
