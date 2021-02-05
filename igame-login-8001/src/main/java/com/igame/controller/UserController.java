package com.igame.controller;

import com.igame.entity.User;
import com.igame.service.UserService;
import com.igame.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoying
 * @create 2021-02-05 下午 9:58
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register/creat", method = RequestMethod.POST)
    @ResponseBody
    public MsgUtils createuser(User user) {
        return userService.createUser(user);
    }

}
