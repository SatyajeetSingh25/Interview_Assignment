package com.example.assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.assignment.entitty.Priority;
import com.example.assignment.entitty.User;

@Service
public interface UserPrioritySatisfactionService {

	List<Priority> getAllPriority();

	User addUser(User user);

	Priority addPriority(Priority priority);
}
