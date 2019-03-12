package com.masleena.scheduler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    public Task(String id, String header, String description, String owner) {
        this.id = id;
        this.header = header;
        this.description = description;
        this.owner = owner;
    }
}
