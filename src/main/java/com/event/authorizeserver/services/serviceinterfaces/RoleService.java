package com.event.authorizeserver.services.serviceinterfaces;


import com.event.authorizeserver.models.dao.Role;
import com.event.authorizeserver.models.dto.RoleDto;

import java.util.List;

public interface RoleService {
    List<Role> getAll();
    Role getById(long id);
    Role create(RoleDto roleDto);
    Role update(RoleDto roleDto);
    Role softDelete(long id);
}
