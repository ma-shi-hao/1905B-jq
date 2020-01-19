package com.fh.controller;

import com.fh.bean.po.User;
import com.fh.service.UserService;
import com.fh.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryPageList")
    public PageBean<User> queryPageList(PageBean<User> page){
           userService.queryPageList(page);
        return page;
    }
}
