package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.school.entity.Student;

import jakarta.transaction.Transactional;

public interface stud_repo extends JpaRepository<Student, Integer>{
	
	@Modifying
	@Transactional
	@Query (value="update student set name= :nn where name= :on",nativeQuery = true)
	public int changename(@Param("nn")String nn, @Param("on")String on);
	
	

}
