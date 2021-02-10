package com.igame.service.impl;

import com.igame.dao.SlideshowDao;
import com.igame.service.SlideshowService;
import com.igame.utils.JWTUtils;
import com.igame.utils.MsgUtils;
import com.igame.utils.OSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ChanV
 * @create 2021-02-10-13:59
 */
@Service
public class SlideshowServiceImpl implements SlideshowService {

    @Autowired
    private SlideshowDao slideshowDao;


    @Override
    public MsgUtils addSlideshow(String image_id, String image_introduction, MultipartFile image_url, String token) {
        try {
            JWTUtils.verify(token);
            OSSUtil ossUtil = new OSSUtil();
            String imgUrl = ossUtil.uploadImgFile(image_url);
            this.slideshowDao.addSlideshow(image_id, image_introduction, imgUrl);
            return MsgUtils.build(200, "轮播图增加成功");
        }catch (Exception e){
            return MsgUtils.build(100, e.getMessage());
        }
    }


}
