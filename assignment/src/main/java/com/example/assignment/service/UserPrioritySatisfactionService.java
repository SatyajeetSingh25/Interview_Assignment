package com.example.assignment.service;

import java.util.List;

import com.example.assignment.entitty.Priority;
import com.example.assignment.entitty.User;


public interface UserPrioritySatisfactionService {

	// Method to return all the Priorities
	List<Priority> getAllPriority();

	// Method to add a new Priority
	Priority addPriority(Priority priority);

	// Method to add a new User
	User addUser(User user);

}
