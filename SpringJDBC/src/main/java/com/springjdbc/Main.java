package com.springjdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	  public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        EmployeeDAO employeeDAO = context.getBean("employeeDAO", EmployeeDAO.class);

	        // Inserting an employee
	        Employee newEmployee = new Employee();
	        newEmployee.setId(1);
	        newEmployee.setName("John Doe");
	        employeeDAO.insertEmployee(newEmployee);

	        // Retrieving all employees
	        List<Employee> employees = employeeDAO.getAllEmployees();
	        for (Employee employee : employees) {
	            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName());
	        }
	    }

}
