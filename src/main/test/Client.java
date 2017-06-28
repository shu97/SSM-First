import com.chason.ssm.bean.User;
import com.chason.ssm.dao.UserDao;
import com.chason.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chason on 2017/5/4.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class Client {
    @Resource
    private UserDao userDao ;
    @Autowired
    private UserService userService ;
    @Test
    public void print(){
        User user = userService.isUser("aaa", "123");

    }
    @Test
    public void userTo(){
        User aaa = userService.isUser("aaa", "456");
        System.out.println(aaa.toString());

    }
}
