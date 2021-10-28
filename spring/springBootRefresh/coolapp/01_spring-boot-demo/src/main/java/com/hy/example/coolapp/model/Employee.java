package com.hy.example.coolapp.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Entity(name = "employees")
@Data
public class Employee {

    @Id
    @Column(name = "emp_no")
    private Long id;
    @Column(name = "birth_date")
    private Date dob;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private Character gender;
    @Column(name = "hire_date")
    private Date hireDate;
    @OneToMany(mappedBy = "employee")
    private Set<Title> titles;

}
