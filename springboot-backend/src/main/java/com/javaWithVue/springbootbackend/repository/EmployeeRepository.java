package com.javaWithVue.springbootbackend.repository;

import com.javaWithVue.springbootbackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
