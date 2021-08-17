package com.example.toron.mapper.user;

import com.example.toron.mvc.user.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserVO login(UserVO vo);
    int user_join(UserVO vo);


}
