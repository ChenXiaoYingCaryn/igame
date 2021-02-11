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
     * 添加轮播图
     *
     * @param image_id
     * @param image_introduction
     * @param token
     * @return
     */
    MsgUtils addSlideshow(String image_id, String image_introduction, String token);

    /**
     * 删除轮播图
     *
     * @param image_id
     * @param token
     * @return
     */
    MsgUtils deleteSlideshow(String image_id, String token);


    /**
     * 更新轮播图
     *
     * @param image_id
     * @param image_introduction
     * @param token
     * @return
     */
    MsgUtils updateSlideshow(String image_id, String image_introduction, String token);

    /**
     * 分页查询轮播图
     *
     * @param curPage
     * @param pageSize
     * @param token
     * @return
     */
    MsgUtils querySlideshow(Integer curPage, Integer pageSize, String token);

    /**
     * 更新轮播图图片
     *
     * @param image_id
     * @param image_url
     * @param token
     * @return
     */
    MsgUtils updateSlideshowImage(String image_id, MultipartFile image_url, String token);



}
