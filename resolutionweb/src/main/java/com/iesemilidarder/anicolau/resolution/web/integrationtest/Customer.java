package com.iesemilidarder.anicolau.resolution.web.integrationtest;

import java.util.UUID;

public class Customer {
	private UUID id = UUID.randomUUID();
	private String name;
	
	public Customer () {}

	public Customer(String name) {
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	//public void setId(Long id) {
	//	this.id = id;
	//}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

}
