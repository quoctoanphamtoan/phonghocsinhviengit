package com.phonghocsinhvienapi.phonghocsinhvienapi.service;

import java.util.List;

import com.phonghocsinhvienapi.phonghocsinhvienapi.dto.RoomDto;

public interface IRoomService {
	List<RoomDto> getAllRoom();
	RoomDto addRoom(RoomDto roomDto);
	void deleteRoom(int id);
	RoomDto editRoom(int id,RoomDto roomDto);
	
}
