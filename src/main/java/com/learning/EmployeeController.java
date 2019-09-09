package com.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
	
	
	@GetMapping(path = "/", produces = "application/json")
	public Employee getEmployee() {
		
		return new Employee(1, "test employee");
	}

}
