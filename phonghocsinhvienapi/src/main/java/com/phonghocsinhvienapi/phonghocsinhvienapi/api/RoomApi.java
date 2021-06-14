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

import com.phonghocsinhvienapi.phonghocsinhvienapi.dto.RoomDto;
import com.phonghocsinhvienapi.phonghocsinhvienapi.service.IRoomService;

@RestController
@RequestMapping("/api/room")
public class RoomApi {
	@Autowired
	private IRoomService romRoomService;

	@GetMapping("")
	public Object getAllRoom() {
		try {
			return new ResponseEntity<List<RoomDto>>(romRoomService.getAllRoom(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("server erro", HttpStatus.BAD_REQUEST);

		}

	}

	@PostMapping("")
	public Object addRoom(@RequestBody RoomDto roomDto) {
		try {
			return new ResponseEntity<RoomDto>(romRoomService.addRoom(roomDto), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Add error", HttpStatus.BAD_REQUEST);
		}

	}

	@DeleteMapping("/{id}")
	public Object deleteRoom(@PathVariable("id") int id) {
		try {
			romRoomService.deleteRoom(id);
			return new ResponseEntity<Object>("Delete Succsess", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Delete error", HttpStatus.BAD_REQUEST);
		}

	}

	@PutMapping("/{id}")
	public Object editRoom(@PathVariable("id") int id, @RequestBody RoomDto roomDto) {
		try {

			return new ResponseEntity<RoomDto>(romRoomService.editRoom(id, roomDto), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Delete error", HttpStatus.BAD_REQUEST);
		}

	}
}
