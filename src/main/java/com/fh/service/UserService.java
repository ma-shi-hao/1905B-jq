package com.fh.service;

import com.fh.bean.po.User;
import com.fh.utils.PageBean;

import java.util.List;

public interface UserService {
    void queryPageList(PageBean<User> page);

    void addUser(User user);

    void delUser(Integer id);

    List<User> queryUser();
}
