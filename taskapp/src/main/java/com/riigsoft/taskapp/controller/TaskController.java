package com.riigsoft.taskapp.controller;

import com.riigsoft.taskapp.entity.Task;
import com.riigsoft.taskapp.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
@RequiredArgsConstructor
public class TaskController {

    // Inject service
    private final TaskService service;


    @GetMapping("/health")
    public String health() {
        return "Task App is running at port 8080";
    }

    // Get all Tasks
    @GetMapping
    public ResponseEntity<List<Task>> getTasks() {

        // get tasks
        var tasks = service.getTasks();

        return ResponseEntity.ok(tasks);
    }

    //create task

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        service.saveTask(task);
        return ResponseEntity.ok(task);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findTaskById(@PathVariable(name = "id") Long id) {
        var task = service.getTaskById(id);

        if (task == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(task);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable(name = "id") Long id, @RequestBody Task task) {

        // Find existing task
        var existingTask = service.getTaskById(id);
        if (existingTask == null)
            return ResponseEntity.notFound().build();

        //update task
        var updateTask = service.updateTask(id, task);

        // return updatedTask
        return ResponseEntity.ok(updateTask);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable(name = "id") Long id){
        var task = service.getTaskById(id);

        if (task == null)
            return ResponseEntity.notFound().build();

        service.deleteTask(id);

        return ResponseEntity.ok(task);
    }
}
