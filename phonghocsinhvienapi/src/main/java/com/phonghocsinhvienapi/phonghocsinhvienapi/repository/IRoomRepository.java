package com.phonghocsinhvienapi.phonghocsinhvienapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonghocsinhvienapi.phonghocsinhvienapi.entity.Room;

@Repository
public interface IRoomRepository extends JpaRepository<Room, Integer>{
}
