package com.chason.ssm.service;

import com.chason.ssm.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chason on 2017/5/3.
 */
@Service
public interface UserService {
    /*查看所有用户*/
    List<User> findAll() ;
    /*保存用户*/
    void save(User user) ;
    /*删除用户*/
    boolean delete(int id) ;
    /*指定id查找用户*/
    User findById(int id) ;
    /*校验用户*/
    User isUser(String name,String password);
}
