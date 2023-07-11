package com.vny.springboot1.myfirstwebapp1.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository <Todo,Integer> {
    public List<Todo> findByUsername(String username);

}
