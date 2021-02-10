package com.igame.dao;

import com.igame.pojo.Slideshow;
import com.igame.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ChanV
 * @create 2021-02-10-13:30
 */
@Repository
@Mapper
public interface SlideshowDao {

    /**
     *
     * @param image_id
     * @param image_introduction
     * @param image_url
     */
    @Insert("INSERT INTO tb_slideshow (image_id, image_introduction, image_url)" +
            " VALUES (#{image_id}, #{image_introduction}, #{image_url})")
    void addSlideshow(@Param("image_id")String image_id, @Param("image_introduction") String image_introduction, @Param("image_url") String image_url);

    /**
     * 删除轮播图
     * @param image_id
     */
    @Delete("UPDATE tb_slideshow SET is_deleted = 1 WHERE image_id = #{image_id}")
    void deleteSlideshow(@Param("image_id") String image_id);

    /**
     * 更新轮播图
     * @param slideshow
     */
    @Update("UPDATE tb_slideshow SET image_introduction = #{slideshow.image_introduction}, image_url = #{slideshow.image_url}" +
                                    "WHERE image_id = #{slideshow.image_id}")
    void updateSlideshow(@Param("slideshow") Slideshow slideshow);

    /**
     * 分页查询轮播图
     * @param curPage
     * @param pageSize
     * @return
     */
    @Select("SELECT * FROM tb_slideshow LIMIT #{curPage}, #{pageSize}")
    List<Slideshow> querySlideshow(@Param("curPage") Integer curPage, @Param("pageSize") Integer pageSize);

}
