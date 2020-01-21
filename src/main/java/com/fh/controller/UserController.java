package com.fh.controller;

import com.fh.bean.po.User;
import com.fh.service.UserService;
import com.fh.utils.ExceUtils;
import com.fh.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

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

    @RequestMapping("/addUser")
    public User addUser(User user){
        userService.addUser(user);
        return user;
    }

    @RequestMapping("/delUser")
    public void delUser(Integer id){
        userService.delUser(id);
    }
    @RequestMapping("/importExcel")
    public void importExcel( HttpServletResponse response){
        List<User> list=userService.queryUser();
        ExceUtils.excelUtil(list,response);
    }
}
