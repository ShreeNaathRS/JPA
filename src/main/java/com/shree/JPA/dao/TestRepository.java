package com.shree.JPA.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.shree.JPA.models.Test;

public interface TestRepository extends CrudRepository<Test, Integer>{
	
	@Query(value = "select * from test where id = ?",nativeQuery = true)
	Stream<Test> findByIdReturnStream(Integer id);
	
}
