package com.igame.controller;

import com.igame.service.SlideshowService;
import com.igame.utils.MsgUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ChanV
 * @create 2021-02-10-14:56
 */
@Api(tags = {"后台管理 -> 轮播图管理"})
@RestController
public class SlideshowController {

    @Autowired
    private SlideshowService slideshowService;

    @ApiOperation("添加轮播图")
    @RequestMapping("/management/slideshow/add")
    public MsgUtils addSlideshow(String image_id, String image_introduction, MultipartFile image_url, String token){
        return this.slideshowService.addSlideshow(image_id, image_introduction, image_url, token);
    }


}
