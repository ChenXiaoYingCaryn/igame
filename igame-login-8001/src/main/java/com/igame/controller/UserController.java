package com.igame.controller;


import com.igame.pojo.User;
import com.igame.service.UserService;
import com.igame.utils.MsgUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiaoying
 * @create 2021-02-05 下午 9:58
 */
@RestController
@RequestMapping("/register")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public  MsgUtils login(User user){
        //登录前初步校验
        if(StringUtils.isBlank(user.getUser_id()) || StringUtils.isBlank(user.getUser_id())) {
            return MsgUtils.build(400, "账号或密码不能为空");
        }
        return userService.login(user);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public MsgUtils createuser(User user) {
        return userService.createUser(user);
    }





}
