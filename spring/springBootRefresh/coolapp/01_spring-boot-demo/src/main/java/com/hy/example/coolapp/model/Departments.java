package com.hy.example.coolapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "departments")
@Data
public class Departments {

    @Id
    @Column(name = "dept_no")
    private String departmentNo;
    @Column(name = "dept_name")
    private String departmentName;

}
