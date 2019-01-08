package com.iesemilidarder.anicolau.resolution.web.bean;


public class Topic {
	private Long id;
	private String name;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private Integer price;
	private String address;
	
	public Topic () {}

	public Topic(Long id, String name, Integer price, String address) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.address = address;
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

	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ",price=" + price + ",address=" + address +"]";

	}
}
