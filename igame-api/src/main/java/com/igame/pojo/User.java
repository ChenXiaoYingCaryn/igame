package com.igame.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ChanV
 * @create 2021-02-05-12:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {
    private String user_id = "";
    private String user_pwd = "";
    private String user_name = "";
    private String user_sex = "";
    private String user_email = "";
    private String user_image = "";
    private int is_deleted = 0;
    private Date create_time;
}
