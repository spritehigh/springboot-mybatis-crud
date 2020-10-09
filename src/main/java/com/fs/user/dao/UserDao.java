package com.fs.user.dao;

import com.fs.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    List<UserEntity> getAll(@Param("content")Map map);

    void delById(Integer id);

    public void saveUser(UserEntity userEntity);

    public UserEntity getUserById(Integer id);

    public void updateUserById(UserEntity userEntity);
}
