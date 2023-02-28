package com.sda.study.springbootpractice.exceptions;



/**
 * Exception if the school not found.
 *
 * @author Joozepp
 * @Date 2/27/2023
 */
public class SchoolNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

    public SchoolNotFoundException(Long id){
        super(String.format("School not found by for id: %d", id));
    }

    public SchoolNotFoundException(String name){
        super(String.format("School not found by for id: %s", name));
    }
}
