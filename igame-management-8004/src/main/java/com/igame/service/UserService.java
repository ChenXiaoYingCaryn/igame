package com.igame.service;

import com.igame.pojo.User;
import com.igame.utils.MsgUtils;

/**
 * @author ChanV
 * @create 2021-02-07-11:09
 */
public interface UserService {


    /**
     * 增加用户
     *
     * @param user
     * @return
     */
    MsgUtils addUser(User user, String token);

    /**
     * 删除用户
     *
     * @param user_id
     * @return
     */
    MsgUtils deleteUser(String user_id, String token);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    MsgUtils updateUser(User user, String token);

    /**
     * 分页查询用户
     *
     * @param curPage
     * @param pageSize
     * @return
     */
    MsgUtils queryUser(Integer curPage, Integer pageSize, String token);
}
