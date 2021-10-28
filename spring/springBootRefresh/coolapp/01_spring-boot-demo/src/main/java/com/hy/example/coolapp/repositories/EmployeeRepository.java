package com.hy.example.coolapp.repositories;

import com.hy.example.coolapp.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Long countByFirstName(String firstName);

    List<Employee> findByFirstName(String firstName, Pageable pageable);
}
