package com.igame.controller;


import com.igame.pojo.User;
import com.igame.service.LoginService;
import com.igame.utils.MsgUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ChanV
 * @create 2021-02-05-23:30
 */
@Api(tags = {"登陆管理"})
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ApiOperation("注册")
    @RequestMapping(value = "/register/create")
    public MsgUtils create(User user){
        return this.loginService.create(user);
    }

    @ApiOperation("登陆")
    @RequestMapping(value = "/register/login")
    public MsgUtils login(User user){
        return this.loginService.login(user);
    }

    @ApiOperation("更换头像")
    @RequestMapping(value = "/register/updateUserImage")
    private MsgUtils updateUserImage(MultipartFile user_image, String user_id, String token){
        return this.loginService.updateUserImage(user_image, user_id, token);
    }

}
