package com.fh.service.impl;

import com.fh.bean.po.User;
import com.fh.dao.UserDao;
import com.fh.service.UserService;
import com.fh.utils.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public void queryPageList(PageBean<User> page) {
        Long count=userDao.queryCount();
        page.setRecordsTotal(count);
        page.setRecordsFiltered(count);
        List<User> list=userDao.queryList(page);
        page.setList(list);
    }
}
