package com.event.authorizeserver.services;

import com.event.authorizeserver.models.dao.User;
import com.event.authorizeserver.models.dto.UserDto;
import com.event.authorizeserver.models.mappers.user.UserMapper;
import com.event.authorizeserver.models.repositoties.UserRepository;
import com.event.authorizeserver.services.serviceinterfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public User create(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        userRepository.save(user);
        return user;
    }

    @Override
    public User update(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        userRepository.save(user);
        return user;
    }

    @Override
    public User softDelete(long id) {
        userRepository.deleteById(id);
        return new User();
    }

}
