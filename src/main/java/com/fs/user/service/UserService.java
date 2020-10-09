package com.fs.user.service;

import com.fs.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserEntity> getAll(Map map);

    void delById(Integer id);

    //保存用户
    public void saveUser(UserEntity userEntity);
}
