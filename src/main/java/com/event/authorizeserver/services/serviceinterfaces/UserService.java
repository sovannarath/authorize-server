package com.event.authorizeserver.services.serviceinterfaces;


import com.event.authorizeserver.models.dao.User;
import com.event.authorizeserver.models.dto.UserDto;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(long id);
    User create(UserDto userDto);
    User update(UserDto userDto);
    User softDelete(long id);
}
