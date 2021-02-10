package com.igame.controller;

import com.igame.service.SlideshowService;
import com.igame.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ChanV
 * @create 2021-02-10-13:59
 */
@RestController
@RequestMapping("/management/slideshow")
public class SlideshowController {

    @Autowired
    private SlideshowService slideshowService;

    @RequestMapping("/add")
    public MsgUtils addSlideshow(@RequestParam String image_id, @RequestParam String image_introduction, @RequestBody MultipartFile image_url, @RequestParam String token){
        return this.slideshowService.addSlideshow(image_id, image_introduction, image_url, token);
    }
}
