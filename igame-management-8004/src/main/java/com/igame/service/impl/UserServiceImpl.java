package com.igame.service.impl;

import com.igame.dao.UserDao;
import com.igame.pojo.User;
import com.igame.service.UserService;
import com.igame.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ChanV
 * @create 2021-02-07-11:12
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public MsgUtils addUser(User user) {
        try {
            this.userDao.addUser(user);
            return MsgUtils.build(200, user.getUser_name() + "用户增加成功");
        }catch (Exception e){
            return MsgUtils.build(100, e.getMessage());
        }
    }

    @Override
    public MsgUtils deleteUser(String user_id) {
        try {
            this.userDao.deleteUser(user_id);
            return MsgUtils.build(200, user_id + "用户删除成功");
        }catch (Exception e){
            return MsgUtils.build(100, e.getMessage());
        }
    }

    @Override
    public MsgUtils updateUser(User user) {
        try {
            this.userDao.updateUser(user);
            return MsgUtils.build(200, user.getUser_id() + "用户更新成功");
        }catch (Exception e){
            return MsgUtils.build(100, e.getMessage());
        }
    }

    @Override
    public MsgUtils queryUser(Integer curPage, Integer pageSize) {
        try {
            List<User> users = this.userDao.queryUser(curPage * pageSize, pageSize);
            return MsgUtils.build(200, "查询成功", users);
        }catch (Exception e){
            return MsgUtils.build(200, e.getMessage());
        }
    }
}
