package com.igame.service;

import com.igame.pojo.User;
import com.igame.utils.MsgUtils;
import org.springframework.stereotype.Repository;

/**
 * 用户业务
 * @author xiaoying
 * @create 2021-02-05 下午 9:59
 */
public interface UserService {

    /**
     * 用户登录
     * @param user
     * @return
     */
    MsgUtils login(User user);

    /**
     * 用户注册方法
     * @param user
     * @return
     */
    MsgUtils createUser(User user);

}
