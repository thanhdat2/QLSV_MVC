package com.thanhdatpb.java.Models;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class Teacher implements Serializable{
    private String id;
    private String name;
    private List<Classroom> subject;

    public Teacher(String id, String name, List<Classroom> subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
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

    public List<Classroom> getSubject() {
        return subject;
    }

    public void setSubject(List<Classroom> subject) {
        this.subject = subject;
    }


    public Collection<Object> getSubjects() {
        return List.of();
    }

    public void setSubjects(Collection<Object> subjects) {

    }
}
