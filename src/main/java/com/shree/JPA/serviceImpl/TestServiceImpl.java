package com.shree.JPA.serviceImpl;

import java.util.List;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shree.JPA.Service.TestService;
import com.shree.JPA.dao.TestRepository;
import com.shree.JPA.models.Test;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestRepository testRepository;
	
	@Override
	@Transactional
	public List<Test> getTestData() {
		Stream<Test> data = testRepository.findByIdReturnStream(1); 
		data.forEach(dat->{
			System.out.println(dat);
		});
		return null;
	}
	
	@Override
	public void saveTestData() {
		Test data = new Test(1,"Shree");
		testRepository.save(data);
	}
	
}
