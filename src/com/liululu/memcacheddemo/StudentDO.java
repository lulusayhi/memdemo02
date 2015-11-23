package com.liululu.memcacheddemo;

import java.io.Serializable;

public class StudentDO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7555588474372914679L;
	private int id;
	private int age;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public StudentDO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
