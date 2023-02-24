package com.marco.RestApiWithSpringBoot.requests;

import com.marco.RestApiWithSpringBoot.entities.enums.TaskStatusEnum;

import java.util.Date;

public record UpdateTaskInput(TaskStatusEnum status, Date dueDate) {
}
