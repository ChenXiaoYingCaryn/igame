package com.igame.service.impl;

import com.igame.dao.UserDao;
import com.igame.pojo.User;
import com.igame.service.UserService;
import com.igame.utils.JWTUtils;
import com.igame.utils.MsgUtils;
import com.igame.utils.JSONUtils;
import com.igame.utils.OSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;


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
        map.put("user_id", user.getUser_id());
        map.put("user_name", user.getUser_name());
        String token = JWTUtils.getToken(map);
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

    @Override
    public MsgUtils updateUserImage(MultipartFile user_image, String user_id, String token) {

        try {
            JWTUtils.verify(token);
            OSSUtil ossUtil = new OSSUtil();
            String imgName = user_image.getOriginalFilename();
            String imgUrl = ossUtil.uploadImgFile(user_image);
            this.userDao.updateUserImage(imgUrl, user_id);
            return MsgUtils.build(200, "头像更新成功");
        }catch (Exception e){
            e.printStackTrace();
            return MsgUtils.build(100, e.getMessage());
        }
    }

}
