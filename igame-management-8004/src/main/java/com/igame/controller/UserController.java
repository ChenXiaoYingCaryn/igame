package com.igame.controller;

import com.igame.pojo.User;
import com.igame.service.UserService;
import com.igame.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public MsgUtils addUser(@RequestParam User user, @RequestParam String token){
        return this.userService.addUser(user, token);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public MsgUtils deleteUser(@RequestParam String user_id, @RequestParam String token){
        return this.userService.deleteUser(user_id, token);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public MsgUtils updateUser(@RequestParam User user, @RequestParam String token){
        return this.userService.updateUser(user, token);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public MsgUtils queryUser(@RequestParam Integer curPage, @RequestParam Integer pageSize, @RequestParam String token){
        return this.userService.queryUser(curPage, pageSize, token);
    }

}
