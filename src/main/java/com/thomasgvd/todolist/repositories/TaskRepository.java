package com.thomasgvd.todolist.repositories;

import com.thomasgvd.todolist.models.MyTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<MyTask, Integer> {

}
