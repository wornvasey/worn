package com.springbootplus.springboot.mapper;

import com.springbootplus.springboot.entity.StudentInfo;
import org.apache.ibatis.annotations.*;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

@Mapper
public interface StudentMapper {


    @Select("select * from studentinfo where username=#{username}")
    public List<StudentInfo>findByUsername(String username);

    @Select("select username ,password from studentinfo where username=#{username}and password=#{password}")
    public  StudentInfo findByUsernameAndPassword(@Param("username")String username,@Param("password")String password);

    @Select("select * from studentinfo where username=#{username}")
    public String selectUsername(@Param("username")String username);

    @Insert("insert into studentinfo(username,password,sex,birthday,myself,QQ) values(#{username},#{password},#{sex},#{birthday},#{myself},#{QQ})")
    public void save(@Param ( "username" ) String username , @Param( "password" ) String password , @Param( "sex" ) String sex, @Param("birthday") String birthday , @Param( "myself" ) String myself, @Param( "QQ" ) String QQ);

    @Update("update studentinfo set sex = #{sex},QQ = #{QQ},birthday = #{birthday},myself = #{myself} where username=#{username}")
    public void  update(@Param("sex")String sex,@Param("QQ")String QQ,@Param("birthday")String birthday,@Param("myself")String myself,@Param("username")String username);

}
