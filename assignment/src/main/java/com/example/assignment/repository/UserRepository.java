package com.example.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment.entitty.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
