package top.redautu.service;

import org.springframework.stereotype.Component;
import top.redautu.dao.UserDao;
import top.redautu.dao.UserDaoImpl;
import top.redautu.dao.UserDaoMysqlImpl;


/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */
@Component
public class UserServiceImpl implements UserService{


    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void change() {
        System.out.println("更改了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}
