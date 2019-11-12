package com.ngmc.controller;

import com.ngmc.entity.User;
import com.ngmc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public ModelAndView test(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping("/user/get/{uid}")
    public @ResponseBody String getUser(@PathVariable("uid") Long uid){
        User user= userService.getUser(uid);
        return "{\"uid\":\""+user.getUserId()+"\",\"uname\":\""+user.getUserName()+"\"}";
    }



}
