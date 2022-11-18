package com.electronic.boot.mapper;

import com.electronic.boot.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-11-18 22:32:19
* @Entity com.electronic.boot.bean.User
*/
@Repository
public interface UserMapper extends BaseMapper<User> {

}




