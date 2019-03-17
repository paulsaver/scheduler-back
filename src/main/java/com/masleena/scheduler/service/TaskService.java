package com.masleena.scheduler.service;

import com.masleena.scheduler.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    Task createTask(Task task);

    void deleteTask(String id);

    Task editTask(Task task);
}
