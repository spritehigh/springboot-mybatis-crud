package com.fs.user.controller;

import com.fs.user.entity.UserEntity;
import com.fs.user.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * @RestController=@Controller+@ResponseBody
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){
        return userService.getAll(map);
    }

    @RequestMapping("/deleteById")
    public String delById(Integer id){
        userService.delById(id);
        return "redirect:/index.html";
    }

    //保存用户
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity){
        userService.saveUser(userEntity);
        return "success";
    }

    //根据Id查询用户信息
    @RequestMapping("/getUserById")
    @ResponseBody
    public UserEntity getUserById(Integer id){
        return userService.getUserById(id);
    }

    //根据Id修改用户信息
    @RequestMapping("/updateUserById")
    @ResponseBody
    public String updateUserById(@RequestBody UserEntity userEntity){
        userService.updateUserById(userEntity);
        return "success";
    }
}
