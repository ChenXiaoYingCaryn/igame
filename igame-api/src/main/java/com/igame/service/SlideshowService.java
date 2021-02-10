package com.igame.service;

import com.igame.config.FeignMultipartSupportConfig;
import com.igame.utils.MsgUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ChanV
 * @create 2021-02-10-14:52
 */
@Component
@FeignClient(value = "IGAME-MANAGEMENT", configuration = FeignMultipartSupportConfig.class)
public interface SlideshowService {

    @PostMapping("/management/slideshow/add")
    public MsgUtils addSlideshow(@RequestParam(value = "image_id") String image_id, @RequestParam(value = "image_introduction") String image_introduction, @RequestPart("image_url") MultipartFile image_url, @RequestParam("token") String token);


}
