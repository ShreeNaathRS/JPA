package com.shree.JPA.Service;

import java.util.List;

import com.shree.JPA.models.Test;

public interface TestService {
	List<Test> getTestData();
	void saveTestData();
}
