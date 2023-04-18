package com.cloud.docker.ems.services;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cloud.docker.ems.model.Employee;

@Service
public class EmployeeServices {

	static List<Employee> empList= new LinkedList<Employee>();
	
	static {
		Employee e1= new Employee(1L, "Raghu", "Ankad1", "rgv.ankad@gmail.com1", "8105887467");
		Employee e2= new Employee(2L, "Raghu1", "Ankad2", "rgv.ankad@gmail.com2", "8105887467");
		Employee e3= new Employee(3L, "Raghu2", "Ankad3", "rgv.ankad@gmail.com3", "8105887467");
		Employee e4= new Employee(4L, "Raghu3", "Ankad4", "rgv.ankad@gmail.com4", "8105887467");
		Employee e5= new Employee(5L, "Raghu4", "Ankad5", "rgv.ankad@gmail.com5", "8105887467");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		}

	public List<Employee> addEmployee(Employee addEmployee){
		empList.add(addEmployee);
		return empList;
	}
	
	public List<Employee> deleteEmployee(Long id) {
		Iterator<Employee> iterator = empList.iterator();  
		while(iterator.hasNext())  
		{  
			Employee deleteEmployee=iterator.next();  
			if(deleteEmployee.getId()==id)  
			{  
				iterator.remove();  
				return empList;
			}
		}
		return null; 
	}
	
	public Employee fetchEmployee(Long id){
		return empList.stream()
                .filter(emp -> emp.getId().equals(id))
                .findAny()
                .orElse(null);
	}
	
	public List<Employee> getAllEmployees() {
		return empList;
	}
}
