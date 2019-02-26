package com.masleena.scheduler.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Task {

    @Id
    private String id;
    private String header;
    private String description;
    @DBRef
    private TaskStatus taskStatus;
    @DBRef
    private TaskList taskList;
    private String owner;
    private Date dueDate;


    public Task() {
    }

    public Task(String id, String header, String description, TaskStatus taskStatus, TaskList taskList, String owner, Date dueDate) {
        this.id = id;
        this.header = header;
        this.description = description;
        this.taskStatus = taskStatus;
        this.taskList = taskList;
        this.owner = owner;
        this.dueDate = dueDate;
    }

    public Task(String id, String header, String description, String owner) {
        this.id = id;
        this.header = header;
        this.description = description;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
