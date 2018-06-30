package com.gegz.service.impl;

import com.gegz.common.BeanUtilPlus;
import com.gegz.dao.UserDao;
import com.gegz.dto.UserDto;
import com.gegz.model.User;
import com.gegz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void insertUser(UserDto userDto) {
        User user = new User();
        BeanUtilPlus.copy(userDto, user);
        userDao.insert(user);
    }
}
