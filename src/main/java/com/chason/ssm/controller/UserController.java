package com.chason.ssm.controller;

import com.chason.ssm.bean.User;
import com.chason.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by chason on 2017/5/3.
 */

@Controller
public class UserController {
    private Logger log = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(Model model) {
        log.info("查询所有用户信息");
        List<User> userList = userService.findAll();
        model.addAttribute("userList", userList);
        return "hello";
    }

    @RequestMapping("/login")
    public String getShow(String username, String password, HttpSession session) {
        //校验，service
        // 之后
        User user = userService.isUser(username, password);
        if(user!=null){
            session.setAttribute("username",user.getName());
            return "/success.html";
        }
        //session记录
        //重定向
        return "redirect:/index.jsp" ;
    }
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
    return "redirect:index" ;
    }
}
