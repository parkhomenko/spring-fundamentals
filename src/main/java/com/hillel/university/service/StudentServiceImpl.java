package com.hillel.university.service;

import com.hillel.university.model.Student;
import com.hillel.university.repository.StudentRepository;
import com.hillel.university.repository.StudentsRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository =
            new StudentsRepositoryImpl();

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findStudents();
    }
}
