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
    public MsgUtils add(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public MsgUtils delete(@RequestBody String user_id){
        return this.userService.deleteUser(user_id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public MsgUtils update(@RequestBody User user){
        return this.userService.updateUser(user);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public MsgUtils query(@RequestBody Integer curPage, @RequestBody Integer pageSize){
        return this.userService.queryUser(curPage, pageSize);
    }

}
