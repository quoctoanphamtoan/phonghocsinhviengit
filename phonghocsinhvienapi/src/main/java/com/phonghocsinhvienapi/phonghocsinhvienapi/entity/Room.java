package com.phonghocsinhvienapi.phonghocsinhvienapi.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Room")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "facultyName")
	private String facultyName;
	
	@JoinColumn(name = "room_id")
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Student> students;

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

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Room(int id, String name, String facultyName, List<Student> students) { 
		this.id = id;
		this.name = name;
		this.facultyName = facultyName;
		this.students = students;
	}

	public Room(String name, String facultyName, List<Student> students) { 
		this.name = name;
		this.facultyName = facultyName;
		this.students = students;
	}

	public Room() { 
	}

	public Room(String name, String facultyName) {
		super();
		this.name = name;
		this.facultyName = facultyName;
	}
	
	
}
