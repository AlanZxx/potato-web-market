package com.potato.marketweb.service.impl;

import com.potato.marketweb.bean.User;
import com.potato.marketweb.mapper.mysqlmapper.UserMapper;
import com.potato.marketweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getByUserNameAndPassword(User user) {
        User loginUser = userMapper.getByUserNameAndPassword(user);
        return loginUser;
    }

    @Override
    public User getUserByUserid(String userId) {
        User loginUser = userMapper.getUserByid(userId);
        return loginUser;
    }

}
