package com.example.jpa.repository;

import com.example.jpa.entity.Course;
import com.example.jpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository repository;
    @Test
    public void saveCourseWithTeacher(){
        Teacher teacher=Teacher.builder()
                .firstName("Hoang")
                .lastName("Hai")
                .build();
        Course course1=Course.builder()
                .title("Java")
                .credit(6)
                .teacher(teacher)
                .build();
        Course course2=Course.builder()
                .title("C#")
                .credit(7)
                .teacher(teacher)
                .build();
        List<Course> courses=new ArrayList<>(3);
        courses.add(course1);
        courses.add(course2);

        repository.saveAll(courses);

    }

}