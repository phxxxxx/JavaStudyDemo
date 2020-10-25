package top.redautu.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.redautu.pojo.User;
import top.redautu.utils.MybatisUtils;

import java.util.List;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/25.
 * @description:
 */

public class UserMapperTest {

    @Test
    public void test01(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserList();
        List<User> userListById = mapper.getUserListById(2);

        for (User user : userList) {
            System.out.println(user);
        }
        System.out.println("-------------");
        for (User user : userListById) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void addUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(3,"wuk","234");
        mapper.addUser(user);


        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void updateUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(2,"jack","111");
        mapper.updateUser(user);


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(1);


        sqlSession.commit();
        sqlSession.close();
    }




}