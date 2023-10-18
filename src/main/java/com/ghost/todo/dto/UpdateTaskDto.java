package com.ghost.todo.dto;

import com.ghost.todo.model.Status;
import jakarta.validation.constraints.NotBlank;

public record UpdateTaskDto(
        @NotBlank
        String title,
        String description,
        Status status
) {
}
