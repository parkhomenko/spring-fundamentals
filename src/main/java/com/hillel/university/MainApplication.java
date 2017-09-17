package com.hillel.university;

import com.hillel.university.model.Student;
import com.hillel.university.service.StudentService;
import com.hillel.university.service.StudentServiceImpl;

import java.util.List;
import java.util.function.Consumer;

public class MainApplication {

    public static void main(String[] args) {

        StudentService studentService =
                new StudentServiceImpl();

        List<Student> students =
                studentService.getAllStudents();

        /*
        for (Student student : students) {
            System.out.println(student);
        }
        */

        students.forEach(System.out::println);
    }
}
