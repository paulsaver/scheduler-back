package com.masleena.scheduler.model;

import com.masleena.scheduler.model.enums.TaskStatuses;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

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

    @Enumerated(EnumType.STRING)
    private TaskStatuses taskStatus;

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
