package com.example.assignment.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.entitty.Priority;
import com.example.assignment.service.UserPrioritySatisfactionService;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	public UserPrioritySatisfactionService userPrioritySatisfactionService;
	
	// Post method to add a Priority
	@PostMapping("/addpriority")
	public void addPriority(@Valid @RequestBody Priority priority) {
		userPrioritySatisfactionService.addPriority(priority);
		 
	}
	
}


