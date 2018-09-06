package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.model.Tlabelinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * AUTHOR: Wanggc
 * Date : 2018/9/3 13:48
 */
@Controller
public class LabelInfoController {
    @RequestMapping("/ss")
    public String show(){
        return "success1";
    }
    @RequestMapping("/echarts")
    @ResponseBody
    public Map<String,Object> index(){
        String categories[]={"衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"};
        int[] data={5, 20, 36, 10, 10, 20};
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("categories",categories);
        map.put("data",data);
        return map;
    }
//    @Autowired
//    private TlabelinfoDao tLabelinfoDao;

//    String labelNo="001002";
//    @RequestMapping("/ww")
//    @ResponseBody
//    public Tlabelinfo get(){
//        Tlabelinfo tlabelinfo= tLabelinfoDao.get(labelNo);
//        System.out.println(tlabelinfo);
//        return tlabelinfo;
//    }
//    @RequestMapping("/wg")
//    @ResponseBody
//    public Tlabelinfo gett(){
//        Tlabelinfo tlabelinfo= tLabelinfoDao.gett(labelNo);
//        System.out.println(tlabelinfo);
//        return tlabelinfo;
//    }
}
