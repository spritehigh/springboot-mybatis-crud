package com.fs.user.controller;

import com.fs.user.entity.UserEntity;
import com.fs.user.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * @RestController=@Controller+@ResponseBody
 */
@Controller
@RequestMapping("user")
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
}
