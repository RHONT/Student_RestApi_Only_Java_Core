package com.example.lastworkstudent.services.api;



import com.example.lastworkstudent.entity.Departments;
import com.example.lastworkstudent.entity.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {


    double findMaxSalaryOfDepartment(Integer department);

    double findMinSalaryOfDepartment(Integer department);

    List<Employee> getEmployeesOfDepartment(Integer dep);

    Map<Departments, List<Employee>> groupEmployeesByDepartments();

    double sumPayDepartment(Integer department);
}
