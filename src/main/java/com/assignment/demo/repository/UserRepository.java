package com.assignment.demo.repository;

import com.assignment.demo.model.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long> {

    User findByFirstName(@Param("firstName") String firstName);
    Collection<User> findAll();
}
