package com.igame.test;

import com.igame.dao.UserDao;
import com.igame.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author xiaoying
 * @create 2021-02-05 上午 12:40
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTest {
        @Autowired
        UserDao userDao;

        @Test
        public void insertTest(){
                userDao.addUser(new User("123","123","chen","女","739130811@qq.com","abc"));
        }

        @Test
        void test(){
                System.out.println("test");
        }
}
