package com.igame.dao;

import com.igame.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ChanV
 * @create 2021-02-07-11:07
 */
@Repository
@Mapper
public interface UserDao {




    /**
     * 增加用户
     * @param user
     */
    @Insert("INSERT INTO tb_user (user_id,user_pwd,user_name,user_sex,user_email,user_image) " +
            " VALUES (#{user.user_id},#{user.user_pwd},#{user.user_name},#{user.user_sex},#{user.user_email}," +
            "#{user.user_image})")
    void addUser(@Param("user") User user);


    /**
     * 删除用户
     * @param user_id
     */
    @Update("UPDATE tb_user SET is_deleted = 1 WHERE user_id = #{user_id}")
    void deleteUser(@Param("user_id") String user_id);

    /**
     * 更新用户
     * @param user
     */
    @Update("UPDATE tb_user SET user_pwd = #{user.user_pwd}, user_name = #{user.user_name}," +
                                "user_sex = #{user.user_sex}, user_email = #{user.user_email} " +
                                "where user_id = #{user.user_id}")
    void updateUser(@Param("user") User user);

    /**
     * 分页查询用户
     * @param curPage
     * @param pageSize
     * @return
     */
    @Select("SELECT * FROM tb_user LIMIT #{curPage}, #{pageSize}")
    List<User> queryUser(@Param("curPage") Integer curPage, @Param("pageSize") Integer pageSize);
}
