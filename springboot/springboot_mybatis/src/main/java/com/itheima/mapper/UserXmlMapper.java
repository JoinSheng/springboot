package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: JoinCao
 * @CreateDate: 2020-03-03
 */
@Repository
@Mapper
public interface UserXmlMapper {
    public List<User> findAll();
}
