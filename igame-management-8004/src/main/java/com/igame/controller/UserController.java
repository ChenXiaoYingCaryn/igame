package com.igame.controller;

import com.igame.pojo.User;
import com.igame.service.UserService;
import com.igame.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChanV
 * @create 2021-02-07-11:15
 */
@RestController
@RequestMapping("/management/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public MsgUtils addUser(@RequestBody User user, String token){
        return this.userService.addUser(user, token);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public MsgUtils deleteUser(@RequestBody String user_id, String token){
        return this.userService.deleteUser(user_id, token);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public MsgUtils updateUser(@RequestBody User user, String token){
        return this.userService.updateUser(user, token);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public MsgUtils queryUser(@RequestBody Integer curPage, @RequestBody Integer pageSize, String token){
        return this.userService.queryUser(curPage, pageSize, token);
    }

}
