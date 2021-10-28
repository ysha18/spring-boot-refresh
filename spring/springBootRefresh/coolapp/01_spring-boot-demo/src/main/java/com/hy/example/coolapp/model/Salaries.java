package com.hy.example.coolapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "salaries")
public class Salaries {
    @Id
    @Column(name="salary")
    private int id;
    @Column(name = "from_date")
    private Date fromDate;
    @Column(name = "to_date")
    private Date toDate;
    @ManyToOne
    @JoinColumn(name = "emp_no", nullable = false)
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "dep_no", nullable = false)
    private Departments departments;
}
