package com.sda.study.springbootpractice.services;
import com.sda.study.springbootpractice.exceptions.CourseNotFoundException;
import com.sda.study.springbootpractice.exceptions.SchoolNotFoundException;
import com.sda.study.springbootpractice.models.School;
import java.util.List;

/**
 *
 * To handle all School related operations
 * @author Joozepp
 * @Date 2/27/2023
 */
public interface SchoolService {

    /**
     * To create a new school
     *
     * @param school School
     */

    void createSchool(School school);

    /**
     * To find a school by ID
     *
     * @param id School ID
     * @return School
     */
    School findSchoolById(Long id) throws SchoolNotFoundException;


    /**
     * to find a school by name
     *
     * @param name School name
     * @return School
     */
    School findSchoolByName(String name) throws SchoolNotFoundException;


    /**
     * to find all schools
     *
     * @return a list of Schools
     */
    List<School> findAllSchools();

    /**
     * to update an existing school
     *
     * @param school School
     */
    void updateSchool(School school) throws SchoolNotFoundException;

    /**
     * to delete a School by ID
     *
     * @param id School ID
     */
    void deleteSchoolById(Long id) throws SchoolNotFoundException, CourseNotFoundException;

    /**
     * to restore a School by ID
     *
     * @param id School ID
     */
    void restoreSchoolById(Long id) throws SchoolNotFoundException, CourseNotFoundException;

}
