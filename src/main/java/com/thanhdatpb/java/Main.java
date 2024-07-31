package com.thanhdatpb.java;

import com.thanhdatpb.java.Handler.DataHandler;
import com.thanhdatpb.java.Models.Classroom;
import com.thanhdatpb.java.Models.Student;
import com.thanhdatpb.java.Models.Subject;
import com.thanhdatpb.java.Models.Teacher;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo dữ liệu mẫu
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Subject> subjects = new ArrayList<>();
        List<Classroom> classrooms = new ArrayList<>();

        // Thêm dữ liệu mẫu cho sinh viên
        students.add(new Student("S1", "John Doe", new ArrayList<>()));
        students.add(new Student("S2", "Jane Smith", new ArrayList<>()));

        // Thêm dữ liệu mẫu cho giáo viên
        teachers.add(new Teacher("T1", "Prof. Anderson", new ArrayList<>()));
        teachers.add(new Teacher("T2", "Dr. Brown", new ArrayList<>()));

        // Thêm dữ liệu mẫu cho môn học
        Subject javaSubject = new Subject("SUB1", "Java", null);
        Subject springBootSubject = new Subject("SUB2", "Spring Boot", null);
        subjects.add(javaSubject);
        subjects.add(springBootSubject);
        subjects.add(new Subject("SUB3", "Python", null));
        subjects.add(new Subject("SUB4", "Django", null));

        // Thêm dữ liệu mẫu cho lớp học
        Classroom classA = new Classroom("CLS1", "Class A", new ArrayList<>(), new ArrayList<>());
        Classroom classB = new Classroom("CLS2", "Class B", new ArrayList<>(), new ArrayList<>());
        classrooms.add(classA);
        classrooms.add(classB);

        // Phân lớp học cho sinh viên
        classA.getStudents().add(students.get(0));
        classB.getStudents().add(students.get(1));

        // Phân môn học cho các lớp học
        classA.getSubjects().add(javaSubject);
        classA.getSubjects().add(springBootSubject);
        classB.getSubjects().add(subjects.get(2));
        classB.getSubjects().add(subjects.get(3));

        // Phân giáo viên cho các môn học
        javaSubject.setTeacher(teachers.get(0));
        springBootSubject.setTeacher(teachers.get(1));

        // Tạo danh sách dữ liệu chung để lưu vào file
        List<Object> data = new ArrayList<>();
        data.add(students);
        data.add(teachers);
        data.add(subjects);
        data.add(classrooms);

        // Lưu dữ liệu vào file
        DataHandler.writeData("data.dat", data);

    }
}



