package com.igame.utils;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.profile.DefaultProfile;

/**
 * @author ChanV
 * @create 2021-02-04-14:14
 */


public class SMSUtils {
    DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "<accessKeyId>", "<accessSecret>");
    IAcsClient client = new DefaultAcsClient(profile);
}
