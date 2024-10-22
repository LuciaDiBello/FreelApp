package com.freelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freelapp.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
