package com.example.springbootmybatis.service;

import com.example.springbootmybatis.model.UserInfo;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * AUTHOR: Wanggc
 * Date : 2018/9/10 9:37
 */

public interface UserService {

        /*
         * 查询登录人员的信息
         * */
        List<UserInfo> getUserInfos();

        List<UserInfo> getUserInfos(Integer id);
}
