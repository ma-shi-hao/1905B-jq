package com.fh.service;

import com.fh.bean.po.User;
import com.fh.utils.PageBean;

public interface UserService {
    void queryPageList(PageBean<User> page);
}
