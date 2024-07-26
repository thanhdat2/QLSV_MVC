package com.thanhdatpb.java.Controllers;

import com.thanhdatpb.java.Models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentController {
    private List<Student> students;

    public StudentController() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (students.stream().noneMatch(s -> s.getId().equals(student.getId()))) {
            students.add(student);
        } else {
            System.out.println("Student with this ID already exists.");
        }
    }

    public void updateStudent(Student updatedStudent) {
        Optional<Student> studentOpt =
                students.stream().filter(s -> s.getId().equals(updatedStudent.getId())).findFirst();
        if (studentOpt.isPresent()) {
            Student student = studentOpt.get();
            student.setName(updatedStudent.getName());
            student.setClasses(updatedStudent.getClasses());
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(String studentId) {
        students.removeIf(s -> s.getId().equals(studentId));
    }

    public List<Student> getStudents() {
        return students;
    }
}
