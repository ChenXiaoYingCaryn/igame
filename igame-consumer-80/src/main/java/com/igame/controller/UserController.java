package com.igame.controller;

import com.igame.pojo.User;
import com.igame.service.UserService;
import com.igame.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChanV
 * @create 2021-02-07-14:20
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //@RequestMapping("/management/user/add")
//    public MsgUtils addUser(User user, String token){
//        return this.userService.addUser(user, token);
//    }
//
//    @RequestMapping("/management/user/delete")
//    public MsgUtils deleteUser(String user_id, String token){
//        return this.userService.deleteUser(user_id, token);
//    }
//
//    @RequestMapping("/management/user/update")
//    public MsgUtils updateUser(User user, String token){
//        return this.userService.updateUser(user, token);
//    }
//
//    @RequestMapping("/management/user/query")
//    public MsgUtils queryUser(Integer curPage, Integer pageSize, String token){
//        return this.userService.queryUser(curPage, pageSize, token);
//    }
}
