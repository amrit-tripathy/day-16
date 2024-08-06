package com.grayMatter.beans;

import java.util.HashSet;

public class Student {
	private String name;
	private int id;
	private HashSet<Course>courses;
//	private Order order;
//	public Student() {
//		super();
//	}
//	public Student(String name, int id, Order order) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.order = order;
//	}
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", id=" + id + ", order=" + order + "]";
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public Order getOrder() {
//		return order;
//	}
//	public void setOrder(Order order) {
//		this.order = order;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public HashSet<Course> getCourses() {
		return courses;
	}
	public void setCourses(HashSet<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", courses=" + courses + "]";
	}
	public Student(String name, int id, HashSet<Course> courses) {
		super();
		this.name = name;
		this.id = id;
		this.courses = courses;
	}
	public Student() {
		super();
	}
	
	

	


}
