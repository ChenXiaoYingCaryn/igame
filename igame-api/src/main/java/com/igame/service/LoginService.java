package com.igame.service;

import com.igame.pojo.MsgUtils;
import com.igame.pojo.User;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ChanV
 * @create 2021-02-05-12:33
 */
@Component
@FeignClient(value = "IGAME-LOGIN")
public interface LoginService {

    @PostMapping("/register/create")
    public MsgUtils create(@Param("user") User user);

    @PostMapping("/register/login")
    public MsgUtils login(@Param("user")User user);

}
