package com.grayMatter.beans;

public class CustomerBean {
	
	private String name;
	private int id;
	private String mobile;
	public CustomerBean() {
		super();
	}
	public CustomerBean(String name, int id, String mobile) {
		super();
		this.name = name;
		this.id = id;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "CustomerBean [name=" + name + ", id=" + id + ", mobile=" + mobile + "]";
	}
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
