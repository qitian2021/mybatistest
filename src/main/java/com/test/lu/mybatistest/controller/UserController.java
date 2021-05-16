package com.test.lu.mybatistest.controller;

import com.test.lu.mybatistest.entity.User;
import com.test.lu.mybatistest.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lenovo
 */
@Api("用户API接口")
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @ApiOperation(value = "根据id查询用户信息")
    @GetMapping("/one")
    public User selectById(@RequestParam("id") Integer id) {
        return userService.selectById(id);
    }

}
