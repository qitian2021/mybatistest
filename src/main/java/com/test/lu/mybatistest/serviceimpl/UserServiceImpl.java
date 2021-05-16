package com.test.lu.mybatistest.serviceimpl;

import com.test.lu.mybatistest.entity.User;
import com.test.lu.mybatistest.mapper.UserMapper;
import com.test.lu.mybatistest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lenovo
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }
}
