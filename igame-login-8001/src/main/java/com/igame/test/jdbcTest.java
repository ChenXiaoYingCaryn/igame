package com.igame.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import javax.sql.DataSource;

/**
 * @author xiaoying
 * @create 2021-02-05 下午 3:23
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class jdbcTest {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws Exception {
        System.out.println("获取的数据库连接为:"+dataSource.getConnection());
    }

}
