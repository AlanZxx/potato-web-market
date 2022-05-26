package com.potato.marketweb.mapper;

import com.potato.marketweb.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //通过用户名密码查询用户数据
    User getByUserNameAndPassword(User user);
    //通过用户id查找user
    User getUserByid(String id);
}
