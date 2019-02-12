package com.masleena.scheduler.controller;

import com.masleena.scheduler.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.masleena.scheduler.repositories.TaskRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/getAllTasks")
    public @ResponseBody
    List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    @PostMapping("/insertTask")
    public String insertTask(@RequestBody Task task) {
        taskRepository.save(task);
        return task.getId();
    }
}
