package com.hillel.university.service;

import com.hillel.university.model.Student;
import com.hillel.university.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("student-service")
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    public StudentServiceImpl() {
    }

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Autowired
    //@Qualifier("student-repository")
    //@Resource(name = "student-repository")
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findStudents();
    }
}
