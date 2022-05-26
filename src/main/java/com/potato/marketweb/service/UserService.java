package com.potato.marketweb.service;

import com.potato.marketweb.bean.User;

public interface UserService {
    public User getByUserNameAndPassword(User user);
    public User getUserByUserid(String userId);
}
