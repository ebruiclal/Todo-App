package com.example.springmysql.Repo;

import com.example.springmysql.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem,Long> {

}
