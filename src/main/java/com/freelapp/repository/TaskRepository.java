package com.freeIapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.freeIapp.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
