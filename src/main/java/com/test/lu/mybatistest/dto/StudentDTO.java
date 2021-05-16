package com.test.lu.mybatistest.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Lenovo
 */
@Data
public class StudentDTO implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private Integer mId;
}
