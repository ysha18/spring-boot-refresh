package com.hy.example.coolapp;

import com.hy.example.coolapp.model.Employee;
import com.hy.example.coolapp.services.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class CoolappApplicationTests {

	@Autowired
	private EmployeeService employeeService;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetAllEmployees(){
//		Slice<Employee> employeeList = employeeService.getEmployees(17);
//		Assertions.assertEquals(employeeList.getSize(), 17);
	}

}
