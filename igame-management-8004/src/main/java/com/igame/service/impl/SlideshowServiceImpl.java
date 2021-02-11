package com.igame.service.impl;

import com.igame.dao.SlideshowDao;
import com.igame.pojo.Slideshow;
import com.igame.service.SlideshowService;
import com.igame.utils.JWTUtils;
import com.igame.utils.MsgUtils;
import com.igame.utils.OSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author ChanV
 * @create 2021-02-10-13:59
 */
@Service
public class SlideshowServiceImpl implements SlideshowService {

    @Autowired
    private SlideshowDao slideshowDao;


    @Override
    public MsgUtils addSlideshow(String image_id, String image_introduction, String token) {
        try {
            JWTUtils.verify(token);
            this.slideshowDao.addSlideshow(image_id, image_introduction);
            return MsgUtils.build(200, "轮播图增加成功");
        }catch (Exception e){
            return MsgUtils.build(100, e.getMessage());
        }
    }

    @Override
    public MsgUtils deleteSlideshow(String image_id, String token) {
        try {
            JWTUtils.verify(token);
            this.slideshowDao.deleteSlideshow(image_id);
            return MsgUtils.build(200, "轮播图删除成功");
        }catch (Exception e){
            return MsgUtils.build(100, e.getMessage());
        }
    }

    @Override
    public MsgUtils updateSlideshow(String image_id, String image_introduction, String token) {
        try {
            JWTUtils.verify(token);
            this.slideshowDao.updateSlideshow(image_id, image_introduction);
            return MsgUtils.build(200, "轮播图更新成功");
        }catch (Exception e){
            return MsgUtils.build(100, e.getMessage());
        }
    }

    @Override
    public MsgUtils querySlideshow(Integer curPage, Integer pageSize, String token) {
        try {
            JWTUtils.verify(token);
            List<Slideshow> slideshows = this.slideshowDao.querySlideshow(curPage, pageSize);
            return MsgUtils.build(200, "轮播图查询成功", slideshows);
        }catch (Exception e){
            return MsgUtils.build(100, e.getMessage());
        }
    }

    @Override
    public MsgUtils updateSlideshowImage(String image_id, MultipartFile image_url, String token) {
        try {
            JWTUtils.verify(token);
            OSSUtil ossUtil = new OSSUtil();
            String url = ossUtil.uploadImgFile(image_url);
            this.slideshowDao.updateSlideshowImage(image_id, url, token);
            return MsgUtils.build(200, "轮播图图片更新成功");
        }catch (Exception e){
            return MsgUtils.build(100, e.getMessage());
        }
    }


}
