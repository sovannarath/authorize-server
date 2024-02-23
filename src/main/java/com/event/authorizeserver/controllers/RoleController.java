package com.event.authorizeserver.controllers;

import com.event.authorizeserver.models.dto.RoleDto;
import com.event.authorizeserver.models.mappers.role.RoleMapper;
import com.event.authorizeserver.models.mappers.role.RoleVOMapper;
import com.event.authorizeserver.models.mappers.role.vo.RoleCreateRequestV0;
import com.event.authorizeserver.models.mappers.role.vo.RoleCreateResponseVO;
import com.event.authorizeserver.models.mappers.role.vo.RoleResponseVO;
import com.event.authorizeserver.models.mappers.role.vo.RoleUpdateRequestVO;
import com.event.authorizeserver.services.serviceinterfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RoleController {

    @Autowired
    private RoleService roleService;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RoleVOMapper roleVOMapper;

    @PostMapping("/roles")
    public RoleCreateResponseVO create(@RequestBody RoleCreateRequestV0 roleRequest) {
        RoleDto roleDto = roleVOMapper.fromRoleCreateRequestVO(roleRequest);
        return roleVOMapper.toRoleCreateResponseVO(roleService.create(roleDto));
    }

    @GetMapping("/roles")
    public List<RoleResponseVO> getAll() {
        return roleVOMapper.toListRoleResponseVO(roleService.getAll());
    }

    @PutMapping("/roles")
    public RoleResponseVO create(@RequestBody RoleUpdateRequestVO roleRequest) {
        RoleDto roleDto = roleVOMapper.fromRoleUpdateRequestVO(roleRequest);
        return roleVOMapper.toRoleResponseVO(roleService.update(roleDto));
    }

    @GetMapping("/roles/{id}")
    public RoleResponseVO getById(@PathVariable("id") long id) {
        return roleVOMapper.toRoleResponseVO(roleService.getById(id));
    }

    @DeleteMapping("/roles/{id}")
    public RoleResponseVO delete(@PathVariable("id") long id) {
        return roleVOMapper.toRoleResponseVO(roleService.softDelete(id));
    }

}
