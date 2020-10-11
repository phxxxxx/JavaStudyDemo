package top.redautu.test;

import org.junit.*;
import org.junit.jupiter.api.Test;
import top.redautu.dao.UserDao;
import top.redautu.domain.User;

public class UserDaoTest {

    @Test
    public void testLogin(){
        User loginUser = new User();
        loginUser.setUsername("shy");
        loginUser.setPassward("123");

        UserDao dao = new UserDao();
        User login = dao.login(loginUser);
        System.out.println(login);


    }
}
