package com.crudReactSpringBoot.ImpService;

import java.util.List;
import java.util.Optional;

import com.crudReactSpringBoot.model.Employee;

public interface IEmployeeService {
	public Employee  saveEmployee(Employee employee); 
	public  List<Employee> getAllEmployees(); 
	public  Optional<Employee> getEmployeeById( Long id);
	public Employee  updateEmployee( Long id,Employee employee); 
	public void deleteEmployee(Long id);
	

}
