package com.springbootplus.springboot.service;

import com.springbootplus.springboot.entity.StudentInfo;
import com.springbootplus.springboot.mapper.StudentMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Size;
import java.util.List;

@Service
public class StudentService {

    @Autowired(required = false)
    StudentMapper studentMapper;

    //register function
    public void save(String username,String password,String sex ,String birthday,String myself,String QQ  ){

        studentMapper.save(username,password,sex,birthday,myself,QQ);
    }

    //login in function（通过账号和密码查询数据库进行登陆）
    public StudentInfo findByUsernameAndPassword(String username,String password){
         return  studentMapper.findByUsernameAndPassword(username,password);
    }

    //查询学生信息功能（通过用户名查询学生所有信息）
    public List<StudentInfo>findByUsername(String username){

        return studentMapper.findByUsername(username);
    }
    //学生修改信息功能
    public void update(String sex,String birthday,String myself,String QQ,String username){

        studentMapper.update(sex,birthday,myself,QQ,username);
    }
    //注册验证用户名是否重复
    public String selectUsername(String username){
        return  studentMapper.selectUsername(username);
    }


}
