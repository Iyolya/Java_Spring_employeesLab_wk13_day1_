package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeserviceApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void createEmployee(){
		Employee toby= new Employee("Toby", 32, "HJ323", "toby@gmail.com");
		employeeRepository.save(toby);
	}



}
