package com.gxh.mybaits.dao;

import com.gxh.mybaits.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from user")
    public List<User> getUser();
}
