package com.phonghocsinhvienapi.phonghocsinhvienapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonghocsinhvienapi.phonghocsinhvienapi.dto.RoomDto;
import com.phonghocsinhvienapi.phonghocsinhvienapi.entity.Room;
import com.phonghocsinhvienapi.phonghocsinhvienapi.repository.IRoomRepository;
import com.phonghocsinhvienapi.phonghocsinhvienapi.service.IRoomService;

@Service
public class RoomService implements IRoomService {
	@Autowired
	private IRoomRepository roomRepository;

	@Override
	public List<RoomDto> getAllRoom() {
		List<Room> listRoom = roomRepository.findAll();
		List<RoomDto> result = new ArrayList<RoomDto>();
		for (Room room : listRoom) {
			result.add(new RoomDto(room.getId(), room.getName(), room.getFacultyName()));

		}
		return result;
	}

	@Override
	public RoomDto addRoom(RoomDto roomDto) {
		Room room = new Room(roomDto.getName(), roomDto.getFacultyName());
		roomRepository.save(room);
		return roomDto;
	}

	@Override
	public void deleteRoom(int id) {
		roomRepository.deleteById(id);
	}

	@Override
	public RoomDto editRoom(int id, RoomDto roomDto) {
		Room roomEdit = roomRepository.findById(id).orElse(null);
		roomEdit.setName(roomDto.getName());
		roomEdit.setFacultyName(roomDto.getFacultyName());
		roomRepository.save(roomEdit);
		roomDto.setId(id);
		return roomDto;
	}

}
