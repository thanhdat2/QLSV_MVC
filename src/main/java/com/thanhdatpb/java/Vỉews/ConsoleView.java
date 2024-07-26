package com.thanhdatpb.java.Vỉews;

import java.util.Scanner;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("1. Manage Students");
        System.out.println("2. Manage Teachers");
        System.out.println("3. Manage Subjects");
        System.out.println("4. Manage Classrooms");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    public int getUserChoice() {
        return scanner.nextInt();
    }

    public String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    public void manageStudentsMenu() {
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Assign Student to Classroom");
        System.out.println("0. Back");
        System.out.print("Choose an option: ");
    }

    public void manageTeachersMenu() {
        System.out.println("1. Add Teacher");
        System.out.println("2. Update Teacher");
        System.out.println("3. Delete Teacher");
        System.out.println("0. Back");
        System.out.print("Choose an option: ");
    }

    public void manageSubjectsMenu() {
        System.out.println("1. Add Subject");
        System.out.println("2. Update Subject");
        System.out.println("3. Delete Subject");
        System.out.println("4. Assign Teacher to Subject");
        System.out.println("0. Back");
        System.out.print("Choose an option: ");
    }

    public void manageClassroomsMenu() {
        System.out.println("1. Add Classroom");
        System.out.println("2. Update Classroom");
        System.out.println("3. Delete Classroom");
        System.out.println("4. Assign Subject to Classroom");
        System.out.println("0. Back");
        System.out.print("Choose an option: ");
    }
}

