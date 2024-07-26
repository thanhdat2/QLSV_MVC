package com.thanhdatpb.java.Models;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
    private String id;
    private String name;
    private List<Classroom> classes;

    public Student(String id, String name, List<Classroom> classes) {
        this.id = id;
        this.name = name;
        this.classes = classes;
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

    public List<Classroom> getClasses() {
        return classes;
    }

    public void setClasses(List<Classroom> classes) {
        this.classes = classes;
    }
}
