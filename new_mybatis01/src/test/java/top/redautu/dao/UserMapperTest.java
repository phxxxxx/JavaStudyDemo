package top.redautu.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
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
        User user = new User(8,"hk","25374");
        mapper.addUser(user);


        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testLoger() {

        final Logger logger = Logger.getLogger("TestErrOut");
        logger.debug(" This is debug!!!");
        logger.info(" This is info!!!");
        logger.warn(" This is warn!!!");
        logger.error(" This is error!!!");
        logger.fatal(" This is fatal!!!");
    }

    @Test
    public void updateUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(192,"jak","111");
        mapper.updateUser(user);


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(2);


        sqlSession.commit();
        sqlSession.close();
    }




}