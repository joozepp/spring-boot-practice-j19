package com.sda.study.springbootpractice.repositories;

import com.sda.study.springbootpractice.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** Repository to handle all student related DB operations.
 * @author Joozepp
 * @Date 2/22/2023
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
