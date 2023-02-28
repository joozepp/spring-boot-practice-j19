package com.sda.study.springbootpractice.exceptions;

/**Exception if the student not found.
 *
 * @author Joozepp
 * @Date 2/28/2023
 */
public class StudentNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

    public StudentNotFoundException(Long id){
        super(String.format("Student not found by for id: %d", id));
    }

    public StudentNotFoundException(String name){
        super(String.format("Student not found by for id: %s", name));
    }
}
