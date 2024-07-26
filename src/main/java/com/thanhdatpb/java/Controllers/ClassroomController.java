package com.thanhdatpb.java.Controllers;

import com.thanhdatpb.java.Models.Classroom;
import com.thanhdatpb.java.Models.Student;
import com.thanhdatpb.java.Models.Subject;
import com.thanhdatpb.java.Models.Teacher;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClassroomController {
    private List<Classroom> classrooms;

    public ClassroomController() {
        this.classrooms = new ArrayList<>();
    }

    public void addClassroom(Classroom classroom) {
        if (classrooms.stream().noneMatch(c -> c.getId().equals(classroom.getId()))) {
            classrooms.add(classroom);
        } else {
            System.out.println("Classroom with this ID already exists.");
        }
    }

    public void updateClassroom(Classroom updatedClassroom) {
        Optional<Classroom> classroomOpt = classrooms.stream().filter(c -> c.getId().equals(updatedClassroom.getId())).findFirst();
        if (classroomOpt.isPresent()) {
            Classroom classroom = classroomOpt.get();
            classroom.setName(updatedClassroom.getName());
            classroom.setSubjects(updatedClassroom.getSubjects());
            classroom.setStudents(updatedClassroom.getStudents());
        } else {
            System.out.println("Classroom not found.");
        }
    }

    public void deleteClassroom(String classroomId) {
        classrooms.removeIf(c -> c.getId().equals(classroomId));
    }

    public void assignStudentToClassroom(@NotNull Student student, Classroom classroom) {
        if (student.getClasses().size() < 2) {
            student.getClasses().add(classroom);
            classroom.getStudents().add(student);
        } else {
            System.out.println("Student can only be enrolled in up to 2 classrooms.");
        }
    }

    public void assignSubjectToClassroom(Subject subject, @NotNull Classroom classroom) {
        classroom.getSubjects().add(subject);
    }

    public void assignTeacherToSubject(@NotNull Teacher teacher, Subject subject) {
        if (teacher.getSubjects().size() < 3) {
            teacher.getSubjects().add(subject);
            subject.setTeacher(teacher);
        } else {
            System.out.println("Teacher can only teach up to 3 subjects.");
        }
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }
}
