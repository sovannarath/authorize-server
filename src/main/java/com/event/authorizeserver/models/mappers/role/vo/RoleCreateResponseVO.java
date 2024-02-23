package com.event.authorizeserver.models.mappers.role.vo;

import lombok.Data;

@Data
public class RoleCreateResponseVO {
    private long id;
    private String name;
    private String description;
}