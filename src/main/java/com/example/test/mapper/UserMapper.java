package com.example.test.mapper;

import com.example.test.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM t_user t WHERE t.name = #{name} AND t.password = #{password}")
    UserBean getInfo(@Param("name") String name, @Param("password") String password);
}
