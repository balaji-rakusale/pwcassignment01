package com.pwc.SpringBootCrudEx.service.impl;

import com.pwc.SpringBootCrudEx.EmpoyeeException;
import com.pwc.SpringBootCrudEx.entity.Employee;
import com.pwc.SpringBootCrudEx.repository.EmployeeRepository;
import com.pwc.SpringBootCrudEx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) throws EmpoyeeException {
        return employeeRepository.findById(id).orElseThrow(
                () -> new EmpoyeeException("Employee not found for given id" +id));
    }
}
