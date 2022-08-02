package com.example.springmysql.Controller;

import com.example.springmysql.Repo.TodoRepo;
import com.example.springmysql.model.TodoItem;
import com.sun.istack.NotNull;
import net.bytebuddy.utility.nullability.NeverNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")

public class TodoController {
    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();

    }
    @PostMapping
    public TodoItem save(@ @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable long id){
        todoRepo.deleteById(id);
    }
      @PutMapping(value = "/{TodoItem.ıd}")
    public TodoItem update(@PathVariable("todoItemId") int TodoItemId, @RequestBody TodoItem todoItem){
        return todoRepo.updateTodoItem(TodoItemId,todoItem);

    }

}
