package com.phonghocsinhvienapi.phonghocsinhvienapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "address")
	private String address;
	
	@Column(name = "room_id")
	private int room_id;
	
	@ManyToOne
	@JoinColumn(name = "room_id", insertable = false, updatable = false)
	private Room room;
	
	
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
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
	public Student(String name, int age, String address) { 
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	public Student(String name, int age, String address, int room_id, Room room) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.room_id = room_id;
		this.room = room;
	}
	public Student() { 
	}
	
	

}
