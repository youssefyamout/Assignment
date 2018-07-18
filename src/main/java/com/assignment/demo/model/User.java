package com.assignment.demo.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NodeEntity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private Long timestamp;

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Relationship(type = "CURRENTLY_TAKES")
    private List<Course> courseList = new ArrayList<>();


    public Long getTimeStamp() {
        return timestamp;
    }

    public void setTimeStamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User() {

    }

    public User(String firstName, String lastName, Long timestamp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.timestamp = timestamp;
    }
}
