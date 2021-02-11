package com.igame.service;

import com.igame.config.FeignMultipartSupportConfig;
import com.igame.utils.MsgUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ChanV
 * @create 2021-02-10-14:52
 */
@Component
@FeignClient(value = "IGAME-MANAGEMENT")
public interface SlideshowService {

    @PostMapping("/management/slideshow/add")
    public MsgUtils addSlideshow(@RequestParam(value = "image_id") String image_id, @RequestParam(value = "image_introduction") String image_introduction, @RequestParam("token") String token);

    @PutMapping("/management/slideshow/delete")
    public MsgUtils deleteSlideshow(@RequestParam(value = "image_id") String image_id, @RequestParam(value = "token") String token);

    @PutMapping("/management/slideshow/update")
    public MsgUtils updateSlideshow(@RequestParam(value = "image_id") String image_id, @RequestParam(value = "image_introduction") String image_introduction, @RequestParam("token") String token);

    @GetMapping("/management/slideshow/query")
    public MsgUtils querySlideshow(@RequestParam(value = "curPage") Integer curPage, @RequestParam(value = "pageSize") Integer pageSize, @RequestParam(value = "token") String token);

    @PostMapping("/management/slideshow/updateImage")
    public MsgUtils updateSlideshowImage(@RequestParam(value = "image_id") String image_id, @RequestPart(value = "image_url") MultipartFile image_url, @RequestParam("token") String token);
}
