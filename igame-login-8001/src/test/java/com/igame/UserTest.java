package com.igame;

import com.igame.dao.UserDao;
import com.igame.pojo.User;
import com.igame.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author xiaoying
 * @create 2021-02-05 上午 12:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
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
