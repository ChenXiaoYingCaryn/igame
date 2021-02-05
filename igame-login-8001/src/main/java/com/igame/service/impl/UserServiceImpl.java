package com.igame.service.impl;

import com.igame.dao.UserDao;
import com.igame.pojo.User;
import com.igame.service.UserService;
import com.igame.utils.MsgUtils;
import com.igame.utils.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @author xiaoying
 * @create 2021-02-05 下午 10:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public MsgUtils createUser(User user) {
        try{
            //为注册用户填充用户创建时间与更新时间
            user.setCreate_time(new Date());
            //为用户输入密码进行md5加密
            user.setUser_pwd(SecurityUtil.md5(user.getUser_pwd()));
            //调用dao添加用户
            userDao.addUser(user);
            return MsgUtils.build(200, "尊重的["+user.getUser_name()+"],您的账号已成功注册");
        }catch(Exception e){
            e.printStackTrace();
            return MsgUtils.build(100,e.getMessage());
        }
    }
}
