package com.phonghocsinhvienapi.phonghocsinhvienapi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonghocsinhvienapi.phonghocsinhvienapi.dto.StudentDto;
import com.phonghocsinhvienapi.phonghocsinhvienapi.service.IStudentService;

@RestController
@RequestMapping("/api/student")
public class StudentApi {
	@Autowired
	private IStudentService studentService;

	@GetMapping("")
	public Object getAllStudent() {
		try {
			return new ResponseEntity<List<StudentDto>>(studentService.getAllStudent(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("server erro", HttpStatus.BAD_REQUEST);

		}

	}
	@GetMapping("get-by-room/{id}")
	public Object getStudentByRoomId(@PathVariable("id") int id) {
		try {
			return new ResponseEntity<List<StudentDto>>(studentService.getAllStudentByRoomId(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("server erro", HttpStatus.BAD_REQUEST);

		}

	}
	@GetMapping("/{id}")
	public Object getStudentById(@PathVariable("id") int id) {
		try {
			return new ResponseEntity<StudentDto>(studentService.getById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("server erro", HttpStatus.BAD_REQUEST);

		}

	}

	@PostMapping("/add-by-room/{roomId}")
	public Object addStudentByRoomId(@PathVariable("roomId") int roomId, @RequestBody StudentDto studentDto) {
		try {
			studentService.addStudentByRoom(roomId, studentDto);
			return new ResponseEntity<Object>("Add succsess", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Add error", HttpStatus.BAD_REQUEST);
		}

	}

	@DeleteMapping("/{id}")
	public Object deleteStudent(@PathVariable("id") int id) {
		try {
			studentService.deleteStudent(id);
			return new ResponseEntity<Object>("Delete Succsess", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Delete error", HttpStatus.BAD_REQUEST);
		}

	}

	@PutMapping("/{id}")
	public Object editStudent(@PathVariable("id") int id, @RequestBody StudentDto studentDto) {
		try {
			studentService.editStudent(id, studentDto);
			return new ResponseEntity<Object>("Delete succsess!", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Delete error", HttpStatus.BAD_REQUEST);
		}

	}

}
