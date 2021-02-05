package com.igame.dao;

import com.igame.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xiaoying
 * @create 2021-02-05 上午 12:22
 */


@Mapper
public interface UserDao {

    /**
     * 用户登录
     * @param user
     * @return
     */
    @Select("SELECT * FROM tb_user WHERE user_id = #{user_id} AND user_pwd = #{user_pwd}")
    void findUserByIdAndPassword(@Param("user") User user);

    /**
     * 用户注册
     * @param user
     */
    @Insert("INSERT INTO tb_user (user_id,user_pwd,user_name,user_sex,user_email,user_image) " +
            " VALUES (#{user.user_id},#{user.user_pwd},#{user.user_name},#{user.user_sex},#{user.user_email}," +
            "#{user.user_image})")
    void addUser(@Param("user") User user);


}
