package com.hillel.university.repository;

import com.hillel.university.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsRepositoryImpl implements StudentRepository {

    @Override
    public List<Student> findStudents() {

        List<Student> students = new ArrayList<>();

        Student student = new Student(1l, "John", "Doe", 25);
        Student student2 = new Student(2l, "Kate", "White", 26);
        Student student3 = new Student(3l, "Leonard", "Black", 31);

        students.add(student);
        students.add(student2);
        students.add(student3);

        return students;
    }
}
