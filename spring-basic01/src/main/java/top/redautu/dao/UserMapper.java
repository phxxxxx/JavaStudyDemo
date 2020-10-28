package top.redautu.dao;

import top.redautu.pojo.User;

import java.util.List;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/25.
 * @description:
 */

public interface UserMapper {

    List<User> getUserList();

    List<User> getUserListById(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
