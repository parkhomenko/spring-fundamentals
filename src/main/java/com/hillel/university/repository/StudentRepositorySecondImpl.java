package com.hillel.university.repository;

import com.hillel.university.model.Student;

import java.util.Collections;
import java.util.List;

public class StudentRepositorySecondImpl implements StudentRepository {

    @Override
    public List<Student> findStudents() {
        return Collections.emptyList();
    }
}
