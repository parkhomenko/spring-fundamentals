package com.hillel.university.repository;

import com.hillel.university.model.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

//@Primary
@Repository("student-repository-second")
public class StudentRepositorySecondImpl implements StudentRepository {

    @Override
    public List<Student> findStudents() {
        return Collections.emptyList();
    }
}
