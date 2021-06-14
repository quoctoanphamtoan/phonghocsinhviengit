package com.phonghocsinhvienapi.phonghocsinhvienapi.service;

import java.util.List;

import com.phonghocsinhvienapi.phonghocsinhvienapi.dto.StudentDto;

public interface IStudentService {
	List<StudentDto> getAllStudentByRoomId(int id);

	List<StudentDto> getAllStudent();

	void addStudentByRoom(int roomId, StudentDto studentDto);

	void deleteStudent(int id);

	void editStudent(int id, StudentDto studentDto);
	
	StudentDto getById(int id);
}
