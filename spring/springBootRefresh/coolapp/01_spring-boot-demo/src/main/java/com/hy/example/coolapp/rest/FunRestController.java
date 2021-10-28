package com.hy.example.coolapp.rest;

import com.hy.example.coolapp.entities.EmployeeList;
import com.hy.example.coolapp.model.Employee;
import com.hy.example.coolapp.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Slf4j
public class FunRestController {

    private final EmployeeService employeeService;

    @Value("${my.greetings}")
    private String greetingMessage;

    @GetMapping("/")
    public String sayHello(){
        return "Hello, the time is "+ LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
    @GetMapping("/employees")
    public EmployeeList getEmployees(@Param("size") Integer size){
        EmployeeList response = new EmployeeList();
        Slice<Employee> sliceEmployees = employeeService.getEmployees(size==null ? 10 : size );
        List<Employee> employeeList = sliceEmployees.stream().collect(Collectors.toList());
        response.setEmployees(employeeList);
        response.setNextPage(sliceEmployees.hasNext() ? "<a href=/employees?size="+size+"> Next Page " : null);
        return  response;
    }

    @GetMapping("/hello")
    public String greetings(){
        return greetingMessage;
    }
}
