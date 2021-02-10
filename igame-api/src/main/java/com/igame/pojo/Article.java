package com.igame.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author ChanV
 * @create 2021-02-10-13:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Article {
    private String art_id;

    private String art_title;

    private String art_text;

    private String art_image;

    private Integer art_like;

    private Integer art_forward;

    private Integer art_comment;

    private String tag_id;

    private String user_id;

    private String type_id;

    private Integer is_deleted;

    private Date create_time;
}
