/*
package com.test.lu.mybatistest.mapper;

import com.test.lu.mybatistest.entity.Student;
import org.apache.ibatis.annotations.*;

*/
/**
 * @author Lenovo
 *//*

public interface StudentMapper {
    */
/**
     * 获取学生信息
     * id 学号
     * 返回值
     * *//*

    @Select("SELECT * from student")
    @Results({
            @Result(property = "name",column = "name",javaType = Student.class),
    })
    Student getOne(Integer id);

    */
/**
     * 添加
     * *//*

    @Insert("insert into student(name,age,email,m_id) values(#{name},#{age},#{email},#{m_id}")
    void insert(Student student);

    @Update("update student set name=#{name},age=#{age},email=#{email},m_id=#{m_id} where id = #{id}")
    void update(Student student);

    @Delete("delete from student where id =#{id}")
    void delete(Integer id);
}
*/
