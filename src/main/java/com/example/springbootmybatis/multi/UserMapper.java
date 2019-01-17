package com.example.springbootmybatis.multi;


import com.example.springbootmybatis.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
	 UserInfo getUserId(Integer id);
	 List<UserInfo> getUserList(Integer id);
}
