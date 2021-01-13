package com.example.assignment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.entitty.Priority;
import com.example.assignment.entitty.User;
import com.example.assignment.repository.PriorityRepository;
import com.example.assignment.repository.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserRestController {

	@Autowired
	public PriorityRepository priorityRepository ;
	
	@Autowired
	public UserRepository userRepository ;
	
	@GetMapping("/allpriorities")
	public List<Priority> retrieveAllPriorities() {
		return priorityRepository.findAll();
	}
	
	@PostMapping("/adduser")
	public void addUser(@Valid @RequestBody User user) {
		
		
		 userRepository.save(user);
		 System.out.println("User Saved Successfully.");
	}
	

}


