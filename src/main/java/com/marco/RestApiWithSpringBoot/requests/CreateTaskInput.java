package com.marco.RestApiWithSpringBoot.requests;


import com.marco.RestApiWithSpringBoot.entities.Task;
import com.marco.RestApiWithSpringBoot.entities.enums.TaskStatusEnum;

import java.util.Date;

public record CreateTaskInput(String name, String description, TaskStatusEnum status, Date dueDate) {
    public Task toTask() {
        Task task = new Task();

        task.setName(name)
                .setDescription(description)
                .setStatus(status)
                .setDueDate(dueDate);

        return task;
    }
}