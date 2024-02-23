package com.event.authorizeserver.models.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RoleDto {
    private long id;
    private String name;
    private String description;
    private boolean deleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
