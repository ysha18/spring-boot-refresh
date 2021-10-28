package com.hy.example.coolapp.services;

import com.hy.example.coolapp.model.Employee;
import com.hy.example.coolapp.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.IntStream;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getALlEmployees(){
        return employeeRepository.findAll();
    }

    public long countByFirstName(String fName){
        return  employeeRepository.countByFirstName(fName);
    }

    public Slice<Employee> getEmployees(int size){
        Pageable pageable = PageRequest.of(0,size);
        return employeeRepository.findAll(pageable);
    }

}
