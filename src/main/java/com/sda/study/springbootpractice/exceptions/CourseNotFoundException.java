package com.sda.study.springbootpractice.exceptions;

/**
 * @author Joozepp
 * @Date 2/28/2023
 */
public class CourseNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public CourseNotFoundException(Long id){
        super(String.format("Course not found by for id: %d", id));
    }

    public CourseNotFoundException(String name){
        super(String.format("Course not found by for id: %s", name));
    }
}
