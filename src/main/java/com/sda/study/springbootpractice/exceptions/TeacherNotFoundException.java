package com.sda.study.springbootpractice.exceptions;

/**Exception if the Teacher not found.
 *
 * @author Joozepp
 * @Date 2/28/2023
 */
public class TeacherNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public TeacherNotFoundException(Long id){
        super(String.format("Teacher not found by for id: %d", id));
    }

    public TeacherNotFoundException(String name){
        super(String.format("Teacher not found by for id: %s", name));
    }
}

