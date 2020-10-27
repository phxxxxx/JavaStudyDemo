package top.redautu.service;

import top.redautu.dao.UserDao;
import top.redautu.dao.UserDaoImpl;
import top.redautu.dao.UserDaoMysqlImpl;


/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public class UserServiceImpl implements UserService{

    //private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getInfo() {
        userDao.select();
    }

   }
