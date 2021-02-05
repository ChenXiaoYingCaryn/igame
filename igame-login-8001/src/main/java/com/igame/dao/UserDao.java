package com.igame.dao;

import com.igame.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author xiaoying
 * @create 2021-02-05 上午 12:22
 */


@Repository
@Mapper
public interface UserDao {

    @Insert("INSERT INTO tb_user (user_id,user_pwd,user_name,user_sex,user_email,user_image,is_deleted) " +
            " VALUES (#{user.user_id},#{user.user_pwd},#{user.user_name},#{user.user_sex},#{user.user_email}," +
            "#{user.user_image},#{user.is_deleted})")
    void addUser(@Param("user") User user);

}
