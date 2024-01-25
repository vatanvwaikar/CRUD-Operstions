package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.Student;
import com.school.repository.stud_repo;

@RestController
public class Stud_controller {
	
	@Autowired
	private stud_repo repo1;
	
	@PostMapping("/add-student")
	public String addstudent(@RequestBody Student student) {
		repo1.save(student);
		return" Student with name " + student.getStud_Name()+" saved  successfully";
	}
	
	@GetMapping("/get-student")
	public List<Student>getstudent(){
		return repo1.findAll();
	}
	
	@DeleteMapping("/delet-by-id")
	public String Deletebyid(@RequestParam ("input")int input ) {
		repo1.deleteById(input);
		return"student with id number  : " + input + "deleted successfully "; 
	}
	
	@PutMapping("/change-name") 
	public String Changename(@RequestParam ("newname") String newname, @RequestParam ("oldname") String oldname) {
		
		repo1.changename(newname, oldname);
		return "name change to " + oldname +  "to" +  newname;
		
		
	}
		
	
	
	
	
	

}
