package com.marco.RestApiWithSpringBoot.repositories;


import com.marco.RestApiWithSpringBoot.entities.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository extends CrudRepository<Task, Integer> {
}
