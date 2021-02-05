package com.igame.service;

import com.igame.pojo.User;
import com.igame.utils.MsgUtils;
import org.springframework.stereotype.Repository;

/**
 * 用户业务
 * @author xiaoying
 * @create 2021-02-05 下午 9:59
 */
@Repository
public interface UserService {

    /**
     * 用户注册方法
     * @param user
     * @return
     */
    MsgUtils createUser(User user);

}
