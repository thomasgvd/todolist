package com.thomasgvd.todolist.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "app_user")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.StringIdGenerator.class,
        property="id")
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;
    private boolean active;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "user_role",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<MyRole> roles;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<MyTask> tasks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<MyRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<MyRole> roles) {
        this.roles = roles;
    }

    public List<MyTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<MyTask> tasks) {
        this.tasks = tasks;
    }
}
