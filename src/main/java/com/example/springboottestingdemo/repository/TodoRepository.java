package com.example.springboottestingdemo.repository;
import com.example.springboottestingdemo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findAll();

    Todo findById(int id);
}
