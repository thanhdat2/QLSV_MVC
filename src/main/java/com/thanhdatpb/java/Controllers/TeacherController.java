package com.thanhdatpb.java.Controllers;

import com.thanhdatpb.java.Models.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeacherController {
    private List<Teacher> teachers;

    public TeacherController() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        if (teachers.stream().noneMatch(t -> t.getId().equals(teacher.getId()))) {
            teachers.add(teacher);
        } else {
            System.out.println("Teacher with this ID already exists.");
        }
    }

    public void updateTeacher(Teacher updatedTeacher) {
        Optional<Teacher> teacherOpt = teachers.stream().filter(t -> t.getId().equals(updatedTeacher.getId())).findFirst();
        if (teacherOpt.isPresent()) {
            Teacher teacher = teacherOpt.get();
            teacher.setName(updatedTeacher.getName());
            teacher.setSubjects(updatedTeacher.getSubjects());
        } else {
            System.out.println("Teacher not found.");
        }
    }

    public void deleteTeacher(String teacherId) {
        teachers.removeIf(t -> t.getId().equals(teacherId));
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
