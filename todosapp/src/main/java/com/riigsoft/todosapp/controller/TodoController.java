package com.riigsoft.todosapp.controller;

import com.riigsoft.todosapp.entity.Todo;
import com.riigsoft.todosapp.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos") // path prefix
@RequiredArgsConstructor // Inject by constructor
public class TodoController {

    // Inject controller to service : mandatory
    private final TodoService service;

    @GetMapping("/health") // just for testing purpose
    public String health() {
        return "App is running at 8080";
    }

    // CREATE
    @PostMapping // HTTP method to create Todo
    public ResponseEntity<Todo> create(@RequestBody Todo todo) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.createTodo(todo));
    }

    // READ ALL
    @GetMapping // HTTP methods to find/get Todo
    public List<Todo> getAll() {
        return service.getAllTodos();
    }

    /**
     * ?: means return multiple types /generic return type
     * */
    // READ BY ID
    @GetMapping("/{id}") // HTTP methods to find Todo by id
    public ResponseEntity<?> getById(@PathVariable Long id) {

        var todo = service.getTodoById(id);

        if (todo == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(todo);
    }

    // UPDATE
    @PutMapping("/{id}") // HTTP method to update Todo by id
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Todo todo) {
        var dbTodo = service.getTodoById(id);

        if (dbTodo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.updateTodo(id, todo));
    }

    // DELETE
    @DeleteMapping("/{id}") // HTTP method to delete Todo by id
    public ResponseEntity<?> delete(@PathVariable Long id) {
        var todo = service.getTodoById(id);

        if (todo == null){
            return ResponseEntity.notFound().build();
        }

        service.deleteTodo(id);
        return ResponseEntity.noContent().build();
    }
}
