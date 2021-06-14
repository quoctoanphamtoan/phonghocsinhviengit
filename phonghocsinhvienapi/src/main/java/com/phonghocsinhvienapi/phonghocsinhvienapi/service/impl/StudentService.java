package com.phonghocsinhvienapi.phonghocsinhvienapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonghocsinhvienapi.phonghocsinhvienapi.dto.StudentDto;
import com.phonghocsinhvienapi.phonghocsinhvienapi.entity.Room;
import com.phonghocsinhvienapi.phonghocsinhvienapi.entity.Student;
import com.phonghocsinhvienapi.phonghocsinhvienapi.repository.IRoomRepository;
import com.phonghocsinhvienapi.phonghocsinhvienapi.repository.IStudentRepository;
import com.phonghocsinhvienapi.phonghocsinhvienapi.service.IStudentService;

@Service
public class StudentService implements IStudentService {
	@Autowired
	private IRoomRepository roomRepository;
	@Autowired
	private IStudentRepository studentRepository;

	@Override
	public List<StudentDto> getAllStudentByRoomId(int id) {
		List<StudentDto> result = new ArrayList<StudentDto>();
		for (Student student : studentRepository.findAll()) {
			if (student.getRoom_id() == id) {
				result.add(new StudentDto(student.getId(), student.getName(), student.getAge(), student.getAddress(),
						student.getRoom_id()));
			}
		}
		return result;
	}

	@Override
	public List<StudentDto> getAllStudent() {
		List<StudentDto> result = new ArrayList<StudentDto>();
		for (Student student : studentRepository.findAll()) {
			result.add(new StudentDto(student.getId(), student.getName(), student.getAge(), student.getAddress(),
					student.getRoom_id()));
		}
		return result;
	}

	@Override
	public void addStudentByRoom(int roomId, StudentDto studentDto) {
		Room room = roomRepository.findById(roomId).orElse(null);
		Student student = new Student(studentDto.getName(), studentDto.getAge(), studentDto.getAddress(), roomId, room);
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int id) { 
		studentRepository.deleteById(id);
	}

	@Override
	public void editStudent(int id, StudentDto studentDto) {
		Student studentEdit = studentRepository.findById(id).orElse(null);
		studentEdit.setAddress(studentDto.getAddress());
		studentEdit.setAge(studentDto.getAge());
		studentEdit.setName(studentDto.getName());
		studentRepository.save(studentEdit);
	}

	@Override
	public StudentDto getById(int id) {
		Student student = studentRepository.findById(id).orElse(null);

		return new StudentDto(student.getId(), student.getName(), student.getAge(), student.getAddress(),
				student.getRoom_id());
	}

}
