package com.riigsoft.taskapp.service;

import com.riigsoft.taskapp.entity.Task;
import com.riigsoft.taskapp.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Annotation to create java beans by spring boot container
@RequiredArgsConstructor // Constructor Injection(service->repo)
public class TaskService {

    // Inject service to repository:mandatory
    private final TaskRepository repo;

    // Get all Tasks
    public List<Task> getTasks() {
        return repo.findAll();
    }


    // Save Task
    public void saveTask(Task task) {
        repo.save(task);
    }

    //Get Task by ID
    public Task getTaskById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Update Task
    public Task updateTask(Long id, Task task) {
        // first find existing task

        var existingTask = repo.findById(id);

        if (existingTask.isEmpty()) {
            return null;
        }

        // Now get task
        var dbTask = existingTask.get();

        // update Task
        dbTask.setTask(task.getTask());
        dbTask.setId(id);
        dbTask.setDone(task.isDone());

        return repo.save(dbTask);
    }

    // delete Task
    public void deleteTask(Long id) {
        repo.deleteById(id);
    }
}
