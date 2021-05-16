package com.test.lu.mybatistest.mapper;

import com.test.lu.mybatistest.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Lenovo
 */
@Mapper
public interface UserMapper {
    /**
     * 根据id查询信息
     * */
    User selectById(Integer id);
   /**
    * 显示用户信息
    * */
   List<User> selectByPage(int current,int size);

   /**
    * 新增用户
    * */
   void insertUser(User user);

   /**
    *
    * */
   void delectUserById(Integer id);
}
