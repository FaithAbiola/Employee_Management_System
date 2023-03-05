package com.faithabiola.spring_boot_react.controller;

import com.faithabiola.spring_boot_react.entity.Employee;
import com.faithabiola.spring_boot_react.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    @PostMapping("/employees")
    public Employee saveEmployeeDetails(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
    @GetMapping("/employees/{id}")
    public Employee getSingleEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id).get();
    }
    @PutMapping("/employees")
    public Employee updateEmployeeDetails(@RequestBody Employee employee) {
       return employeeRepository.save(employee);
    }
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable Long id) {
        employeeRepository.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
}
