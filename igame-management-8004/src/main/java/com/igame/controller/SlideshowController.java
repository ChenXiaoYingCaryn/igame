package com.igame.controller;

import com.igame.service.SlideshowService;
import com.igame.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public MsgUtils addSlideshow(@RequestParam String image_id, @RequestParam String image_introduction, @RequestParam String token){
        return this.slideshowService.addSlideshow(image_id, image_introduction, token);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public MsgUtils deleteSlideshow(@RequestParam String image_id, @RequestParam String token){
        return this.slideshowService.deleteSlideshow(image_id, token);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public MsgUtils updateSlideshow(@RequestParam String image_id, @RequestParam String image_introduction, @RequestParam String token){
        return this.slideshowService.updateSlideshow(image_id, image_introduction, token);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public MsgUtils querySlideshow(@RequestParam Integer curPage, @RequestParam Integer pageSize, @RequestParam String token){
        return this.slideshowService.querySlideshow(curPage, pageSize, token);
    }

    @RequestMapping(value = "/updateImage", method = RequestMethod.POST)
    public MsgUtils updateSlideshowImage(@RequestParam String image_id, @RequestBody MultipartFile image_url, @RequestParam String token){
        return this.slideshowService.updateSlideshowImage(image_id, image_url, token);
    }
}
