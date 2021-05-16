package com.test.lu.mybatistest.service;

import com.test.lu.mybatistest.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author Lenovo
 */

public interface UserService {
    /**
     * id
     *
     * */
    User selectById(Integer id);

}
