package com.masleena.scheduler.repositories;

import com.masleena.scheduler.model.TaskStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "taskStatus", path = "taskStatus")
public interface TaskStatusRepository extends MongoRepository<TaskStatus, String> {
}
