package com.sda.study.springbootpractice.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/** Teacher model
 *
 * @author Joozepp
 * @Date 2/22/2023
 */
@Entity
@Data
public class Teacher extends Auditable<String> implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Enumerated
    private Gender gender;
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Course> coursesGiven;




}
