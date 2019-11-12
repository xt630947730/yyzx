package com.ngmc.service.impl;

import com.ngmc.dao.UserMapper;
import com.ngmc.entity.User;
import com.ngmc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public int regiter(User user) {
        return userMapper.insert(user);
    }

    public User getUser(Long uid) {
        return userMapper.selectById(uid);
    }

    public int editUser(User user) {
        return userMapper.updateById(user);
    }
}
