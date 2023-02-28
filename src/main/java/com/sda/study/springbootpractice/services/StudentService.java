package com.sda.study.springbootpractice.services;

import com.sda.study.springbootpractice.exceptions.SchoolNotFoundException;
import com.sda.study.springbootpractice.exceptions.StudentNotFoundException;
import com.sda.study.springbootpractice.models.School;
import com.sda.study.springbootpractice.models.Student;

import java.util.List;

/**
 * @author Joozepp
 * @Date 2/28/2023
 */
public interface StudentService {

    /**
     * To create a student
     *
     * @param student Student
     */
    void createStudent(Student student);


    Student findStudentById(Long id) throws StudentNotFoundException;


    /**
     * to find a student by name
     *
     * @param name Student name
     * @return Student
     */
    Student findStudentByName(String name) throws StudentNotFoundException;


    /**
     * to find all students
     *
     * @return a list of Students
     */
    List<Student> findAllStudents();

    /**
     * to update an existing Student
     *
     * @param student Student
     */
    void updateStudent(Student student) throws StudentNotFoundException;

    /**
     * to delete a School by ID
     *
     * @param id School ID
     */
    void deleteStudentById(Long id) throws StudentNotFoundException;

    /**
     * to restore a Student by ID
     *
     * @param id Student ID
     */
    void restoreStudentById(Long id) throws StudentNotFoundException;

}
