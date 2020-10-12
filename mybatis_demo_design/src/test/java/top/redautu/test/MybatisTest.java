package top.redautu.test;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import top.redautu.dao.UserDao;
import top.redautu.domain.User;
import top.redautu.mybatis.io.Resources;
import top.redautu.mybatis.sqlsession.SqlSession;
import top.redautu.mybatis.sqlsession.*;

import top.redautu.mybatis.sqlsession.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    /**
     * 入门案例
     * @param args
     */
    @Test
    public static void main(String[] args) throws IOException {
    /*    //读取配置文件
        InputStream in = Resources.getResourceAsStream("myconfig.xml");
        //创建SqlSessionFactory
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = sqlSessionFactoryBuilder.build(in);
        //使用工厂生产SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //使用SqlSession创建的Dao接口的代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        //释放资源
        sqlSession.close();
        in.close();*/

        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("myconfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();


    }
}
