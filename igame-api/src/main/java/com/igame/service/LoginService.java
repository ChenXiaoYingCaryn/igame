package com.igame.service;


import com.igame.config.FeignMultipartSupportConfig;
import com.igame.pojo.User;
import com.igame.utils.MsgUtils;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


/**
 * @author ChanV
 * @create 2021-02-05-12:33
 */
@Component
@FeignClient(value = "IGAME-LOGIN", configuration = FeignMultipartSupportConfig.class)
public interface LoginService {

    @PostMapping("/register/create")
    public MsgUtils create(@Param("user") User user);

    @PostMapping("/register/login")
    public MsgUtils login(@Param("user") User user);

    @PostMapping(value = "/register/updateUserImage", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public MsgUtils updateUserImage(@RequestPart(value = "user_image") MultipartFile user_image, @RequestParam(value = "user_id") String user_id);

}
