package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.model.UserInfo;
import com.example.springbootmybatis.multi.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * AUTHOR: Wanggc
 * Date : 2018/9/5 14:45
 */
@Controller
public class UserController {
    @Autowired
    UserMapper userDao;
    @RequestMapping("/user")
    public String show(){
       List<UserInfo> userInfo= userDao.getUserList(1);
       for(UserInfo u :userInfo){
           System.out.println(u);
       }
       return "success";
    }
    @RequestMapping(value = "/echarts",method = RequestMethod.GET)
    public ModelAndView echarts(){
        return new ModelAndView("echarts");
    }
    @RequestMapping(value = "/useless",method = RequestMethod.POST)
    @ResponseBody
    public List<UserInfo> show1(){
        List<UserInfo> userInfo= userDao.getUserList(1);
        for(UserInfo u :userInfo){
            System.out.println(u.getUsername()+"  "+u.getPassword());
        }
        return userInfo;
    }


}
