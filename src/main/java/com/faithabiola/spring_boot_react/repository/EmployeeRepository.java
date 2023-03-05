package com.faithabiola.spring_boot_react.repository;

import com.faithabiola.spring_boot_react.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
