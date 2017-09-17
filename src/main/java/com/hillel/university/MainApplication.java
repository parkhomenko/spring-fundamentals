package com.hillel.university;

import com.hillel.university.model.Student;
import com.hillel.university.repository.StudentRepository;
import com.hillel.university.service.StudentService;
import com.hillel.university.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.function.Consumer;

public class MainApplication {

    public static void main(String[] args) {

        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("spring-config.xml");

        StudentService studentService =
                appContext.getBean("student-service", StudentService.class);

        List<Student> students =
                studentService.getAllStudents();

        students.forEach(System.out::println);
    }
}
