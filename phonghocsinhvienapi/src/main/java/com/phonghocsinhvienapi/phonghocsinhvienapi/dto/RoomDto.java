package com.phonghocsinhvienapi.phonghocsinhvienapi.dto;

public class RoomDto {
	private int id; 
	private String name; 
	private String facultyName;
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
	public RoomDto(int id, String name, String facultyName) { 
		this.id = id;
		this.name = name;
		this.facultyName = facultyName;
	}
	public RoomDto(String name, String facultyName) { 
		this.name = name;
		this.facultyName = facultyName;
	}
	public RoomDto() { 
	}
	public RoomDto(String name) { 
		this.name = name;
	} 
	
}
