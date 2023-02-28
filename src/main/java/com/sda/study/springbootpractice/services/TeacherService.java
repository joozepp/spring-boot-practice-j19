package com.sda.study.springbootpractice.services;

import com.sda.study.springbootpractice.exceptions.TeacherNotFoundException;
import com.sda.study.springbootpractice.models.Teacher;

import java.util.List;

/**
 * @author Joozepp
 * @Date 2/28/2023
 */
public interface TeacherService {

    /**
     * To create a new teacher
     *
     * @param teacher Teacher
     */

    void createTeacher(Teacher teacher);

    /**
     * To find a teacher by ID
     *
     * @param id Teacher ID
     * @return Teacher
     */
    Teacher findTeacherById(Long id) throws TeacherNotFoundException;


    /**
     * to find a teacher by name
     *
     * @param name Teacher name
     * @return Teacher
     */
    Teacher findTeacherByName(String name) throws TeacherNotFoundException;


    /**
     * to find all teachers
     *
     * @return a list of Teachers
     */
    List<Teacher> findAllTeachers();

    /**
     * to update an existing teacher
     *
     * @param teacher Teacher
     */
    void updateTeacher(Teacher teacher) throws TeacherNotFoundException;

    /**
     * to delete a Teacher by ID
     *
     * @param id Teacher ID
     */
    void deleteTeacherById(Long id) throws TeacherNotFoundException;

    /**
     * to restore a Teacher by ID
     *
     * @param id Teacher ID
     */
    void restoreTeacherById(Long id) throws TeacherNotFoundException;

}
