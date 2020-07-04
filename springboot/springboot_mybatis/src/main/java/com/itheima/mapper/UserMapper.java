package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: JoinCao
 * @CreateDate: 2020-03-03
 */
@Mapper
@Repository
public interface UserMapper {
    @Select("select*from t_user")
    public List<User> findAll();
}
