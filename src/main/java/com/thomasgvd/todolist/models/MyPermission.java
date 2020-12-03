package com.thomasgvd.todolist.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "app_permission")
public class MyPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "permissions")
    private Set<MyRole> roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<MyRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<MyRole> roles) {
        this.roles = roles;
    }
}
