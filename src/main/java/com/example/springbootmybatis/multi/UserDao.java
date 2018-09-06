package com.example.springbootmybatis.multi;


import com.example.springbootmybatis.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
	 UserInfo getUserId(Integer id);
	 List<UserInfo> getUserList(Integer id);
}
