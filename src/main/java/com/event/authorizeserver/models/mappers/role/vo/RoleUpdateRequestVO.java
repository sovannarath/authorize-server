package com.event.authorizeserver.models.mappers.role.vo;

import lombok.Data;

@Data
public class RoleUpdateRequestVO {
    private long id;
    private String name;
    private String description;
}
