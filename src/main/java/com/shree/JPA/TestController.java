package com.shree.JPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shree.JPA.Service.TestService;
import com.shree.JPA.models.Test;

@RestController
public class TestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/get")
	public List<Test> getTestData() {
		return testService.getTestData();
	}
	
	@GetMapping("/save")
	public void saveTestData() {
		testService.saveTestData();
	}
}
