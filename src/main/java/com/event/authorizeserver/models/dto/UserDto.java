package com.event.authorizeserver.models.dto;

import com.event.authorizeserver.commons.Gender;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
public class UserDto {
    private long id;
    private String name;
    private Gender gender;
    private Date dateOfBirth;
    private String placeOfBirth;
    private String email;
    private String phoneNumber;
    private String currentAddress;
    private long organizationId;
    private long roleId;
    private boolean deleted;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
