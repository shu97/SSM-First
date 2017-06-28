package com.chason.ssm.dao;

import com.chason.ssm.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chason on 2017/5/3.
 */
@Repository
public interface UserDao {
    /*查看所有用户列表*/
    List<User> selectAllUser();
    /*校正用户名，密码*/
    User isUser(@Param("name") String name , @Param("password") String password);
    /*修改密码*/
    boolean updatePassword(@Param("password")String password,@Param("nowPassword")String nowPassword) ;
    /*新增用户*/
    void save(User user) ;
    /*删除用户*/
    boolean remove(@Param("id") int id) ;
    /*指定ID查询用户*/
    User findById(@Param("id") int id);
}
