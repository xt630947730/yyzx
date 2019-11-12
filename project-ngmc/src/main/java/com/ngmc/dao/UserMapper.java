package com.ngmc.dao;

import com.ngmc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> findAll();
    User selectById(Long userId);
    int deleteById(Long userId);
    int insert(User record);
    int updateById(User record);
}