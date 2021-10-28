package com.hy.example.coolapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Title {
    @Id
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "from_date")
    private Date fromDate;
    @Column(name = "to_date")
    private Date toDate;
    @ManyToOne
    @JoinColumn(name="emp_no", nullable=false)
    private Employee employee;
}
