package com.assignment.demo.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import javax.validation.constraints.NotNull;

@NodeEntity
public class Course {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String instructor;
    @NotNull
    private String courseTitle;
    


    public Course(String courseTitle, String instructor) {
        this.courseTitle = courseTitle;
        this.instructor = instructor;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }


    public Course() {

    }
}
