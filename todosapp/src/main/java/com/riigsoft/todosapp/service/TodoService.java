package com.riigsoft.todosapp.service;

import com.riigsoft.todosapp.entity.Todo;
import com.riigsoft.todosapp.repo.TodoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // creates java beans(objects)
@RequiredArgsConstructor // Injects by constructor
public class TodoService {

    // Inject service to repository: Mandatory
    private final TodoRepo repo;

    // CREATE
    public Todo createTodo(Todo todo) {
        return repo.save(todo);
    }

    // READ (ALL)
    public List<Todo> getAllTodos() {
        return repo.findAll();
    }

    // READ (BY ID)
    public Todo getTodoById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // UPDATE
    public Todo updateTodo(Long id, Todo updatedTodo) {

        Optional<Todo> optionalTodo = repo.findById(id);

        if (optionalTodo.isEmpty()) {
            return null;
        }

        Todo todoFromDb = optionalTodo.get();
        todoFromDb.setTask(updatedTodo.getTask());
        todoFromDb.setDone(updatedTodo.isDone());

        return repo.save(todoFromDb);
    }


    // DELETE
    public void deleteTodo(Long id) {

        repo.deleteById(id);
    }
}
