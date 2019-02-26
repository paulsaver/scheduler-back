package com.masleena.scheduler.repositories;

import com.masleena.scheduler.model.TaskListJournal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "taskListJournal", path = "taskListJournal")
public interface TaskListJournalRepository extends MongoRepository<TaskListJournal, String> {
}
