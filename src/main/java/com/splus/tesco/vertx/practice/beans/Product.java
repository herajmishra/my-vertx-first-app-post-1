package com.splus.tesco.vertx.practice.beans;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
	private static final AtomicInteger COUNTER = new AtomicInteger();
	private int id; 
	private String name;
	private String productNumber;
	private String color;
	private int category;

	public Product(){

	}

	public Product(String name, String productNumber, String color, int category){
		this.name = name;
		this.productNumber = productNumber;
		this.color = color;
		this.category = category;
	}

	public Product(int id, String name, String productNumber, String color, int category){
		this.id = id;
		this.name = name;
		this.productNumber = productNumber;
		this.color = color;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public static int getCounter() {
		return COUNTER.getAndIncrement();
	}
}
