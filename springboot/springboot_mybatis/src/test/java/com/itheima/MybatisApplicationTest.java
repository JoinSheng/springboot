package com.itheima;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.mapper.UserXmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: JoinCao
 * @CreateDate: 2020-03-03
 */
@RunWith(SpringRunner.class)
@SpringBootTest//(classes = MybatisApplication.class)
public class MybatisApplicationTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserXmlMapper userXmlMapper;

    @Test
    public void mybatisTest() {
        List<User> list = userMapper.findAll();
        System.out.println(list);
    }

    @Test
    public void mybatisXmlTest() {
        List<User> list = userXmlMapper.findAll();
        System.out.println(list);
    }
}
