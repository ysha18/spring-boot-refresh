package com.hy.example.coolapp.entities;

import com.hy.example.coolapp.model.Employee;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeList {

    private List<Employee> employees;
    private String nextPage;
}
