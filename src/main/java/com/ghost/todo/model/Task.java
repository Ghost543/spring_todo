package com.ghost.todo.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.util.UUID;

public record Task(
        @Id
        Integer id,
        @NotBlank
        String title,
        String description,
        Status status
) {
}
