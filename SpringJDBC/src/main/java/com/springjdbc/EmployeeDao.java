package com.springjdbc;
import java.util.List;


public interface EmployeeDao {
	  List<Employee> getAllEmployees();
	    void insertEmployee(Employee employee);
}
