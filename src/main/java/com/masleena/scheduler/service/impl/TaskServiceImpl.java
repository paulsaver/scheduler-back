package com.masleena.scheduler.service.impl;

import com.masleena.scheduler.model.Task;
import com.masleena.scheduler.model.TaskList;
import com.masleena.scheduler.repositories.TaskListRepository;
import com.masleena.scheduler.repositories.TaskRepository;
import com.masleena.scheduler.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskListRepository taskListRepository;

    @Override
    public List<Task> getAllTasks() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String name = user.getUsername(); //get logged in username
        log.debug("Username "+ name +" try to get all tasks");
        return taskRepository.findAllByOwner(name);
    }

    @Override
    public Task createTask(Task task) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String name = user.getUsername(); //get logged in username
        log.debug("Username "+ name + " try to insert task");
        task.setOwner(name);
        if (task.getTaskList() == null) {
            TaskList taskList = new TaskList(null,name + " new task list.");
            taskListRepository.save(taskList);
            task.setTaskList(taskList);
        }
        taskRepository.save(task);
        return task;
    }

    @Override
    public void deleteTask(String id) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String name = user.getUsername(); //get logged in username
        log.debug("Username "+ name + " try to delete task");
        taskRepository.findByIdAndOwner(id, name).ifPresent(task -> taskRepository.delete(task));
    }

    @Override
    public Task editTask(Task task) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String name = user.getUsername(); //get logged in username
        log.debug("Username "+ name + " try to edit task");
        if (taskRepository.findByIdAndOwner(task.getId(), name).isPresent()) {
            return taskRepository.save(task);
        } else return null;
    }
}
