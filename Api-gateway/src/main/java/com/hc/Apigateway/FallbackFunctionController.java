package com.hc.Apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackFunctionController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackFunction() {
		return "User service taking longer time than expected."+
				"Please try again later..!";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackFunction() {
		return "Department service taking longer time than expected."+
				"Please try again later..!";
	}
}
