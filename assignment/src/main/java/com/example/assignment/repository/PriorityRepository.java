package com.example.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment.entitty.Priority;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Integer> {

}
