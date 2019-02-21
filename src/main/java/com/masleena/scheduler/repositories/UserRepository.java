package com.masleena.scheduler.repositories;

import com.masleena.scheduler.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(@Param("email") String email);

    User findByUsername(@Param("username") String username);

}
