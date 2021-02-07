package com.igame.service;

import com.igame.pojo.User;
import com.igame.utils.MsgUtils;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author ChanV
 * @create 2021-02-07-14:21
 */
@Component
@FeignClient(value = "IGAME-MANAGEMENT")
public interface UserService {

    @PostMapping("/management/user/add")
    public MsgUtils addUser(@Param("user") User user, @Param("token") String token);

    @PutMapping("/management/user/delete")
    public MsgUtils deleteUser(@Param("user_id") String user_id, @Param("token") String token);

    @PutMapping("/management/user/update")
    public MsgUtils updateUser(@Param("user") User user, @Param("token") String token);

    @GetMapping("/management/user/query")
    public MsgUtils queryUser(@Param("curPage") Integer curPage, @Param("pageSize") Integer pageSize, @Param("token") String token);

}
