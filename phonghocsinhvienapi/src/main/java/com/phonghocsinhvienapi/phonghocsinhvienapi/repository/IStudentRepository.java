package com.phonghocsinhvienapi.phonghocsinhvienapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonghocsinhvienapi.phonghocsinhvienapi.entity.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>{ 	
}
