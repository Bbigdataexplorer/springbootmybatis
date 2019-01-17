package com.example.springbootmybatis.service.impl;


import com.example.springbootmybatis.model.UserInfo;
import com.example.springbootmybatis.multi.UserMapper;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * AUTHOR: Wanggc
 * Date : 2018/9/10 9:16
 */
@Service
public abstract class UserServerImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserInfo> getUserInfos(Integer id) {
        List<UserInfo> models=new ArrayList<UserInfo>();
        models=userMapper.getUserList(id);
        return models;
    }
}
