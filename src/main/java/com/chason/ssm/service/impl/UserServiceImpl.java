package com.chason.ssm.service.impl;

import com.chason.ssm.bean.User;
import com.chason.ssm.dao.UserDao;
import com.chason.ssm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chason on 2017/5/3.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public List<User> getAllUser() {

        return userDao.selectAllUser();
    }

    public List<User> findAll() {
        return userDao.selectAllUser();
    }

    public void save(User user) {
        if (user != null) {
            userDao.save(user);
        }
    }

    public boolean delete(int id) {
        if (id != 0 && id > 0) {
            return userDao.remove(id);
        }
        return false;
    }

    public User findById(int id) {
        if (id != 0 && id > 0) {
            return userDao.findById(id);
        }
        return null;
    }

    public User isUser(String name, String password) {
        if ((name != null && name != "") && (password != null && password != "")) {
            User user = userDao.isUser(name, password);
            if(user==null){
                return null ;
            }
            return user ;
        }
        return null;
    }
}
