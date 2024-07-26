package com.thanhdatpb.java.Controllers;

import com.thanhdatpb.java.Models.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SubjectController {
    private List<Subject> subjects;

    public SubjectController() {
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        if (subjects.stream().noneMatch(s -> s.getId().equals(subject.getId()))) {
            subjects.add(subject);
        } else {
            System.out.println("Subject with this ID already exists.");
        }
    }

    public void updateSubject(Subject updatedSubject) {
        Optional<Subject> subjectOpt = subjects.stream().filter(s -> s.getId().equals(updatedSubject.getId())).findFirst();
        if (subjectOpt.isPresent()) {
            Subject subject = subjectOpt.get();
            subject.setName(updatedSubject.getName());
            subject.setTeacher(updatedSubject.getTeacher());
        } else {
            System.out.println("Subject not found.");
        }
    }

    public void deleteSubject(String subjectId) {
        subjects.removeIf(s -> s.getId().equals(subjectId));
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
