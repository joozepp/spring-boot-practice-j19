package com.sda.study.springbootpractice.services;
import com.sda.study.springbootpractice.exceptions.CourseNotFoundException;
import com.sda.study.springbootpractice.models.Course;
import com.sda.study.springbootpractice.models.School;

import java.util.List;

/**
 * @author Joozepp
 * @Date 2/28/2023
 */
public interface CourseService {

    /**
     * To create a course
     *
     * @param course Course
     */
    void createCourse(Course course);


    Course findCourseById(Long id) throws CourseNotFoundException;


    /**
     * to find a course by name
     *
     * @param name Course name
     * @return Course
     */
    Course findCourseByName(String name) throws CourseNotFoundException;


    /**
     * to find all courses
     *
     * @return a list of Courses
     */
    List<Course> findAllCourses();


    /**
     * to find all courses by school
     *
     * @param school School
     * @return a list of Courses
     */
    List<Course> findAllCoursesBySchool(School school);

    /**
     * to update an existing Course
     *
     * @param course Course
     */
    void updateCourse(Course course) throws CourseNotFoundException;

    /**
     * to delete a Course by ID
     *
     * @param id Course ID
     */
    void deleteCourseById(Long id) throws CourseNotFoundException;

    /**
     * to restore a Course by ID
     *
     * @param id Course ID
     */
    void restoreCourseById(Long id) throws CourseNotFoundException;

}
