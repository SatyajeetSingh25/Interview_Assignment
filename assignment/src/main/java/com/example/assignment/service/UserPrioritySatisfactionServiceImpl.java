package com.example.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.assignment.entitty.Priority;
import com.example.assignment.entitty.User;
import com.example.assignment.repository.PriorityRepository;
import com.example.assignment.repository.UserRepository;


public class UserPrioritySatisfactionServiceImpl  implements UserPrioritySatisfactionService{

	@Autowired
	private PriorityRepository priorityRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public List<Priority> getAllPriority()
	{
		return priorityRepository.findAll();
		
	}
	
	public Priority addPriority(Priority priority)
	{
		Priority savedPriority = priorityRepository.save(priority);
		return savedPriority;
	}
	
	public User addUser(User user)
	{
		User savedUser = userRepository.save(user);
		return savedUser;
	}

}
