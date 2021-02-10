package com.igame.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author ChanV
 * @create 2021-02-10-13:25
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Slideshow {
    private String image_id;

    private String image_introduction;

    private String image_url;

    private Integer is_deleted;
}
