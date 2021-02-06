package com.igame.test;

import com.igame.dao.UserDao;
import com.igame.loginServer_8001;
import com.igame.pojo.User;
import com.igame.service.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author xiaoying
 * @create 2021-02-05 上午 12:40
 */
//@SpringBootTest
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@SpringBootTest(classes = loginServer_8001.class)
public class UserTest {
        @Autowired
        UserDao userDao;

        @Autowired
        UserService userService;

        @Test
        public void loginTest(){
                userService.createUser(new User("1234","123","chen","女","739130811@qq.com","abc"));
//                userDao.findUserByIdAndPassword(new User("123","123"));
        }

        @Test
        public void insertTest(){
                userDao.addUser(new User("1234","123","chen","女","739130811@qq.com","abc"));
        }

        @Test
        void test(){
                System.out.println("test");
        }
}
