package com.iesemilidarder.anicolau.resolution.web.bean;

import com.iesemilidarder.anicolau.resolution.web.service.StarType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Youthink {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id = 0L;
    private String name;
    private StarType type;
    private Double price = 50.1;

	public Youthink() {}

	public Youthink(String name, StarType type, Double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public Long getId() {
		return id;	
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StarType getType() {
		return type;
	}

	public void setType(StarType type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = 50.50;
	}

	@Override
	public String toString() {
		return "Youthink [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}
}
