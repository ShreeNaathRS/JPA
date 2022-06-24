package com.shree.JPA.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Test {

	protected Test() {}

	public Test(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name = "+this.name+", Id = "+this.id;
	}
}
