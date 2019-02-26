package com.masleena.scheduler.repositories;

import com.masleena.scheduler.model.TaskList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "taskList", path = "taskList")
public interface TaskListRepository extends MongoRepository<TaskList, String> {
}
