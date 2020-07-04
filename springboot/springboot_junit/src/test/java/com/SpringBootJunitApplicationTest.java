package com;

import com.itheima.SpringBootJunitApplication;
import com.itheima.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: JoinCao
 * @CreateDate: 2020-03-02
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJunitApplication.class)
public class SpringBootJunitApplicationTest {
    @Autowired
    private UserService userService;

    @Test
    public void add() {
        userService.add();
    }
}
