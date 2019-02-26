package com.masleena.scheduler.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TaskListJournal {
    @Id
    private String id;
    @DBRef
    private User user;
    @DBRef
    private TaskList taskList;

    public TaskListJournal() {
    }

    public TaskListJournal(String id, User user, TaskList taskList) {
        this.id = id;
        this.user = user;
        this.taskList = taskList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
}
