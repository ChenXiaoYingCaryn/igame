package com.igame.service;

import com.igame.pojo.User;
import com.igame.utils.MsgUtils;
import feign.Param;
import javafx.geometry.Pos;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @author ChanV
 * @create 2021-02-07-14:21
 */
@Component
@FeignClient(value = "IGAME-MANAGEMENT")
public interface UserService {

    @PostMapping("/management/user/add")
    public MsgUtils addUser(@Param(value = "user") User user, @RequestParam(value = "token") String token);

    @PutMapping("/management/user/delete")
    public MsgUtils deleteUser(@RequestParam(value = "user_id") String user_id, @RequestParam(value = "token") String token);

    @PutMapping("/management/user/update")
    public MsgUtils updateUser(@Param(value = "user") User user, @RequestParam(value = "token") String token);

    @GetMapping("/management/user/query")
    public MsgUtils queryUser(@RequestParam(value = "curPage") Integer curPage, @RequestParam(value = "pageSize") Integer pageSize, @RequestParam("token") String token);

}
