package com.igame.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author ChanV
 * @create 2021-02-05-12:33
 */
@Component
@FeignClient(value = "IGAME-LOGIN")
public interface LoginService {



}
