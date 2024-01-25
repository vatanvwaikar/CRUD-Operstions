package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.Address;
import com.school.repository.add_repo;

@RestController
public class Add_controller {
	
	@Autowired
	private add_repo repo2;
	
	@PostMapping("add-address")
	public String addaddress(@RequestBody Address address) {
		repo2.save(address);
		return"address with id  "+ address.getAddressid() +" saved successfully";
	}
	
	@GetMapping("get-address")
	public List<Address>getaddress(){
		return repo2.findAll();
	}
	
	@DeleteMapping("/delet-by-id1")
	public String Deletebyid(@RequestParam ("input")int input ) {
		repo2.deleteById(input);
		return"address with id number  : " + input + "deleted successfully "; 
	}
	
	

}
