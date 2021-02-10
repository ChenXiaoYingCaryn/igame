package com.igame.service;

import com.igame.pojo.Slideshow;
import com.igame.utils.MsgUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ChanV
 * @create 2021-02-10-13:54
 */
public interface SlideshowService {

    /**
     *
     * 添加轮播图
     *
     * @param image_id
     * @param image_introduction
     * @param image_url
     * @param token
     * @return
     */
    MsgUtils addSlideshow(String image_id, String image_introduction, MultipartFile image_url, String token);
}
