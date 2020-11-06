package com.lambdaschool.todos.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "todos")
public class Todos extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;
    @Column(nullable = false, unique = true)
    private String description;
    @Column(nullable = false)
    private boolean completed;


    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    @JsonIgnoreProperties(value = "todos", allowSetters = true)
    private Set<User> users = new HashSet<>();

    public Todos(String description, boolean completed, Set<User> users) {
        this.description = description;
        this.completed = completed;
        this.users = users;
    }

    public Todos() {
    }

    public long getTodoid() {
        return todoid;
    }

    public void setTodoid(long todoid) {
        this.todoid = todoid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
