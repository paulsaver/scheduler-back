package com.masleena.scheduler.controller;

import com.masleena.scheduler.model.Task;
import com.masleena.scheduler.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.masleena.scheduler.utils.RestRequestResponseHelper.*;
import io.swagger.annotations.*;

@Api(value = "tasks", description = "API for Tasks.")
@RestController
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @ApiOperation(value = "Get all tasks", notes = "Description")
    @ApiResponse(code = 200,message ="null")
    @GetMapping("/getAllTasks")
    public @ResponseBody
    ResponseEntity<List<Task>> getAllTasks() {
        return getResponse(taskService.getAllTasks(), HttpStatus.OK);
    }

    @ApiImplicitParam(name = "Task", dataType = "com.masleena.scheduler.model.Task")
    @ApiOperation(value = "Create Task", notes = "Description")
    @ApiResponse(code = 200,message ="null")
    @PostMapping("/createTask")
    public @ResponseBody
    ResponseEntity<Task> createTask(@RequestBody Task task) {
        return getResponse(taskService.createTask(task), HttpStatus.OK);
    }

    @ApiImplicitParam(name = "id", dataType = "java.lang.String")
    @ApiOperation(value = "Delete task", notes = "Description")
    @ApiResponse(code = 200,message ="null")
    @GetMapping("/deleteTask")
    public @ResponseBody
    ResponseEntity deleteTask(@RequestParam("id") String id) {
        taskService.deleteTask(id);
        return getResponse(HttpStatus.OK);
    }

    @ApiImplicitParam(name = "task", dataType = "com.masleena.scheduler.model.Task")
    @ApiOperation(value = "Edit Task", notes = "Description")
    @ApiResponse(code = 200,message ="null")
    @PostMapping("editTask")
    public @ResponseBody
    ResponseEntity<Task> editTask(@RequestBody Task task) {
        return getResponse(taskService.editTask(task), HttpStatus.OK);
    }
}
