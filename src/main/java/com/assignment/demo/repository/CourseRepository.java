package com.assignment.demo.repository;

import com.assignment.demo.model.Course;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CourseRepository extends Neo4jRepository<Course, Long> {

    Course findByCourseTitleContaining(@Param("courseTitle") String courseTitle);

    Collection<Course> findAllByCourseTitleContaining(@Param("courseTitle") String courseTitle);


}
