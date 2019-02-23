package com.masleena.scheduler.controller;

import com.masleena.scheduler.model.Task;
import com.masleena.scheduler.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/getAllTasks")
    public @ResponseBody
    List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/insertTask")
    public @ResponseBody
    Task insertTask(@RequestBody Task task) {
        return taskService.insertTask(task);
    }

    @GetMapping("/deleteTask")
    public @ResponseBody
    String deleteTask(@RequestParam("id") String id){
        taskService.deleteTask(id);
        return "OK";
    }

    @PostMapping("editTask")
    public @ResponseBody
    Task editTask(@RequestBody Task task){
        return taskService.editTask(task);
    }
}
