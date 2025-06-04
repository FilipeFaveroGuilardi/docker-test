package dev.fillipe.docker.controllers;

import dev.fillipe.docker.entities.Todo;
import dev.fillipe.docker.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @PostMapping
    private void addUser(@RequestParam(name = "title") String title) {
        Todo todo = new Todo(title);

        todoRepository.save(todo);
    }


    @GetMapping
    private List<Todo> getTodos() {
        return todoRepository.findAll();
    }

}
