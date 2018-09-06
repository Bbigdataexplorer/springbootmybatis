package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.model.UserInfo;
import com.example.springbootmybatis.multi.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import scala.util.parsing.json.JSONObject;

import java.util.List;

/**
 * AUTHOR: Wanggc
 * Date : 2018/9/5 14:45
 */
@Controller
public class UserController {
    @Autowired
    UserDao userDao;
    @RequestMapping("/user")
    public String show(){
       List<UserInfo> userInfo= userDao.getUserList(1);
       for(UserInfo u :userInfo){
           System.out.println(u);
       }
       return "success";
    }
}
