package com.event.authorizeserver.controllers;

import com.event.authorizeserver.models.dao.User;
import com.event.authorizeserver.models.dto.UserDto;
import com.event.authorizeserver.models.mappers.user.UserMapper;
import com.event.authorizeserver.models.mappers.user.UserVOMapper;
import com.event.authorizeserver.models.mappers.user.vo.UserCreateRequestVO;
import com.event.authorizeserver.models.mappers.user.vo.UserCreateResponseVO;
import com.event.authorizeserver.models.mappers.user.vo.UserResponseVO;
import com.event.authorizeserver.models.mappers.user.vo.UserUpdateRequestVO;
import com.event.authorizeserver.services.serviceinterfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserVOMapper userVOMapper;
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/users")
    public List<UserResponseVO> getAll() {
        return userVOMapper.toListUserResponseVO(userService.getAll());
    }

    @GetMapping("/users/{id}")
    public UserResponseVO getById(@PathVariable("id") long id) {
        return userVOMapper.toUserResponseVO(userService.getById(id));
    }

    @PostMapping("/users")
    public UserCreateResponseVO create(@RequestBody UserCreateRequestVO userRequest) {
        User user = userService.create(userVOMapper.fromUserCreateRequestVO(userRequest));
        return userVOMapper.toUserCreateResponseVO(user);
    }

    @PutMapping("/users")
    public UserResponseVO update(@RequestBody UserUpdateRequestVO userUpdateRequestVO) {
        UserDto userDto = userVOMapper.fromUserUpdateRequestVO(userUpdateRequestVO);
        return userVOMapper.toUserResponseVO(userService.update(userDto));
    }

    @DeleteMapping("/users/{id}")
    public UserResponseVO delete(@PathVariable("id") long id) {
        return userVOMapper.toUserResponseVO(userService.softDelete(id));
    }

}
