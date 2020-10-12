package top.redautu.dao;


import top.redautu.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有操作
     */
//    @Select("select * from user")
    List<User>findAll();
}
