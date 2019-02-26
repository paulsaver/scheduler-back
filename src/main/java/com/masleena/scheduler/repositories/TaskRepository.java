package com.masleena.scheduler.repositories;

import com.masleena.scheduler.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "task", path = "task")
public interface TaskRepository extends MongoRepository<Task, String> {

    List<Task> findByHeaderContains(@Param("header") String header);

    List<Task> findAllByOwner(@Param("owner") String owner);

    Optional<Task> findByIdAndOwner(@Param("id") String id, @Param("owner") String owner);
}
