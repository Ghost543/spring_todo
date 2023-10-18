package com.ghost.todo.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateTaskDto(
        @NotBlank
        String title,
        String description
) {
}
