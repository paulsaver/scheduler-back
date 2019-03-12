package com.masleena.scheduler.controller;

import com.masleena.scheduler.model.Task;
import com.masleena.scheduler.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.masleena.scheduler.utils.RestRequestResponseHelper.getOKWithNull;

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
    ResponseEntity deleteTask(@RequestParam("id") String id){
        taskService.deleteTask(id);
        return getOKWithNull();
    }

    @PostMapping("editTask")
    public @ResponseBody
    Task editTask(@RequestBody Task task){
        return taskService.editTask(task);
    }
}
