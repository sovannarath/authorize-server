package com.event.authorizeserver.models.mappers.user.vo;

import com.example.events.commons.enums.Gender;
import lombok.Data;

import java.sql.Date;

@Data
public class UserCreateResponseVO {
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
}
