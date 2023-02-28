package com.sda.study.springbootpractice.components;

import com.sda.study.springbootpractice.exceptions.CourseNotFoundException;
import com.sda.study.springbootpractice.exceptions.SchoolNotFoundException;
import com.sda.study.springbootpractice.exceptions.StudentNotFoundException;
import com.sda.study.springbootpractice.exceptions.TeacherNotFoundException;
import com.sda.study.springbootpractice.models.*;
import com.sda.study.springbootpractice.repositories.CourseRepository;
import com.sda.study.springbootpractice.services.CourseService;
import com.sda.study.springbootpractice.services.SchoolService;
import com.sda.study.springbootpractice.services.StudentService;
import com.sda.study.springbootpractice.services.TeacherService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Component to initialize data on application startup
 *
 * @author Joozepp
 * @Date 2/27/2023
 */
@Component
public class DataInit {

    @Autowired
    private SchoolService schoolService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private TeacherService teacherService;

    @PostConstruct //when the setup has finalized. spring will call this method automatically.
    public void init() {
        initSchool();
        initCourses();
        initTeacher();
        initStudent();
    }

    //----PRIVATE METHODS----//
    private void initSchool() {
        System.out.println("Starting School initialization...");
        School school = new School();
        school.setName("Tartu University");
        school.setAddress("Ülikooli 18, Tartu.");
        school.setPhone("+372600999");

        try {
            School searchSchool = schoolService.findSchoolByName(school.getName());
            System.out.println("Cannot pre-initialize school: " + school.getName());
        } catch (SchoolNotFoundException e) {
            schoolService.createSchool(school);
        }
    }


    private void initCourses() {
        System.out.println("Starting Course initialization...");
        try {
            School searchSchool = schoolService.findSchoolByName("Tartu University");
            Course course = new Course();
            course.setName("Mathematics");
            course.setStartDate(LocalDate.now());
            course.setDurationInDays(100);
            course.setSchool(searchSchool);

            try {
                Course searchCourse = courseService.findCourseByName(course.getName());
                System.out.println("Cannot pre-initialize school: " + course.getName());
            } catch (CourseNotFoundException e) {
                courseService.createCourse(course);
            }

            Course course1 = new Course();
            course1.setName("Science");
            course1.setSchool(searchSchool);
            course1.setStartDate(LocalDate.now());
            course1.setDurationInDays(150);

            try {
                Course searchCourse = courseService.findCourseByName(course1.getName());
                System.out.println("Cannot pre-initialize school: " + course1.getName());
            } catch (CourseNotFoundException e) {
                courseService.createCourse(course1);
            }
        } catch (SchoolNotFoundException e) {
            System.out.println("Cannot pre-initialize course! Reason:  " + e.getLocalizedMessage());

        }

    }


    private void initTeacher() {
        System.out.println("Starting Teacher initialization...");
        try {
            Course course = courseService.findCourseByName("Mathematics");
            Course course1 = courseService.findCourseByName("Science");

            Teacher teacher = new Teacher();
            teacher.setName("Kaja Kallab");
            teacher.setEmail("kallab@vihm.ee");
            teacher.setGender(Gender.FEMALE);
            teacher.setSpecializedCourses(Arrays.asList(course, course1));

            try {
                Teacher searchTeacher = teacherService.findTeacherByName(teacher.getName());
                System.out.println("Cannot pre-initialize teacher: " + teacher.getName());
            } catch (TeacherNotFoundException e) {
                teacherService.createTeacher(teacher);
            }

        } catch (CourseNotFoundException e) {
            System.out.println("Cannot pre-initialize teacher! Reason:  " + e.getLocalizedMessage());
        }
    }


    private void initStudent() {
        System.out.println("Starting Teacher initialization...");
        try {
            Course course = courseService.findCourseByName("Mathematics");

            Student student = new Student();
            student.setName("Peeter Mihkelson");
            student.setEmail("petrovitsh@mail.ee");
            student.setGender(Gender.MALE);
            student.setAge(55);
            student.setGrade(3.6F);
            student.setCourses(Collections.singletonList(course));

            try {
                Student searchStudent = studentService.findStudentByName(student.getName());
                System.out.println("Cannot pre-initialize student: " + student.getName());
            } catch (StudentNotFoundException e) {
                studentService.createStudent(student);
            }

        } catch (CourseNotFoundException e) {
            System.out.println("Cannot pre-initialize student! Reason:  " + e.getLocalizedMessage());
        }
    }
}