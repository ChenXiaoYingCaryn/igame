package com.igame.controller;


import com.igame.pojo.User;
import com.igame.service.LoginService;
import com.igame.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChanV
 * @create 2021-02-05-23:30
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/register/create")
    public MsgUtils create(User user){
        return this.loginService.create(user);
    }

    @RequestMapping("/register/login")
    public MsgUtils login(User user){
        return this.loginService.login(user);
    }

}
