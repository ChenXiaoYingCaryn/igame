package com.igame.service;

import com.igame.pojo.MsgUtils;
import com.igame.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author ChanV
 * @create 2021-02-05-12:33
 */
@Component
@FeignClient(value = "IGAME-LOGIN")
public interface LoginService {

    @PostMapping("/register/create")
    public MsgUtils create(User user);

}
