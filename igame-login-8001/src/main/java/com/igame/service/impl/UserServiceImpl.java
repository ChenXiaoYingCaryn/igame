package com.igame.service.impl;

import com.igame.dao.UserDao;
import com.igame.pojo.User;
import com.igame.service.UserService;
import com.igame.utils.MsgUtils;
import com.igame.utils.JSONUtils;
import com.igame.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.igame.utils.JWTUtils.getToken;

/**
 * @author xiaoying
 * @create 2021-02-05 下午 10:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public MsgUtils login(User user) {
        //根据用户id和密码获取用户信息
        user = userDao.findUserByIdAndPassword(user.getUser_id() , user.getUser_pwd());
        if(user == null){
            return MsgUtils.build(405,"用户名或密码错误");
        }
        //生成token
        Map<String, String> map = new HashMap<String, String>();
        map.put(user.getUser_id(),user.getUser_pwd());
        String token = getToken(map);
        return MsgUtils.build(200,token,JSONUtils.objectToJson(user));
    }

    @Override
    public MsgUtils createUser(User user) {
        try{
            //调用dao添加用户
            userDao.addUser(user);
            return MsgUtils.build(200, user.getUser_name()+",您的账号已成功注册");
        }catch(Exception e){
            e.printStackTrace();
            return MsgUtils.build(100,e.getMessage());
        }
    }
}
