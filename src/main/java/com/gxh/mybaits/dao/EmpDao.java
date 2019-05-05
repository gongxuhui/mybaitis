package com.gxh.mybaits.dao;

import com.gxh.mybaits.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
@Mapper
public interface EmpDao {

    public List<User> getEmp();

}
