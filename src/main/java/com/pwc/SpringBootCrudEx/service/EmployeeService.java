package com.pwc.SpringBootCrudEx.service;

import com.pwc.SpringBootCrudEx.EmpoyeeException;
import com.pwc.SpringBootCrudEx.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long id) throws EmpoyeeException;

}
