package com.pwc.SpringBootCrudEx.controller;

import com.pwc.SpringBootCrudEx.EmpoyeeException;
import com.pwc.SpringBootCrudEx.entity.Employee;
import com.pwc.SpringBootCrudEx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){

        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> saveEmployee( @PathVariable  Long id) throws EmpoyeeException {

        return new ResponseEntity<>(employeeService.getEmployeeById(id), HttpStatus.OK);
    }
}
