package com.fs.user.service;

import com.fs.user.dao.UserDao;
import com.fs.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }

    @Override
    public void delById(Integer id){
        userDao.delById(id);
    }

    @Override
    public void saveUser(UserEntity userEntity) {
        userEntity.setCreatetime(new Date(System.currentTimeMillis()));
        userEntity.setStatus(1);
        userDao.saveUser(userEntity);
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUserById(UserEntity userEntity) {
        userDao.updateUserById(userEntity);
    }
}
