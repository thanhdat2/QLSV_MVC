package com.thanhdatpb.java.Models;

import java.io.Serializable;
import java.util.List;

public class Classroom implements Serializable {
    private String id;
    private String name;
    private List<Subject> subjects;
    private List<Student> students;

    public Classroom(String id, String name, List<Subject> subjects, List<Student> students) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.students = students;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
