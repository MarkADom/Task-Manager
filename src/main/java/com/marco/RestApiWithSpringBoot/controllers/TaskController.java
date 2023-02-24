package com.marco.RestApiWithSpringBoot.controllers;

import com.marco.RestApiWithSpringBoot.services.TaskService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    public TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    
}
