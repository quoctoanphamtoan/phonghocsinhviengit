package com.phonghocsinhvienapi.phonghocsinhvienapi.dto;

public class StudentDto { 
	private int id; 
	private String name; 
	private int age; 
	private String address; 
	private int room_id;
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
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public StudentDto(int id, String name, int age, String address, int room_id) { 
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.room_id = room_id;
	}
	public StudentDto(String name, int age, String address, int room_id) { 
		this.name = name;
		this.age = age;
		this.address = address;
		this.room_id = room_id;
	}
	public StudentDto() { 
	}
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", room_id="
				+ room_id + "]";
	}
	
	
}
