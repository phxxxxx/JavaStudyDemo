package top.redautu.dao;

import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.redautu.pojo.Blog;
import top.redautu.utils.IdUtils;
import top.redautu.utils.MybatisUtils;
import top.redautu.utils.ShowUtils;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public class BlogMapperTest {
    @Test
    public void addBookTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IdUtils.getUid());
        blog.setAuthor("wukai");
        blog.setcreate_time(new Date());
        blog.setTitle("第一章");
        blog.setViews("325");

        mapper.addBook(blog);

        blog.setId(IdUtils.getUid());
        blog.setTitle("编程之美");
        mapper.addBook(blog);

        blog.setId(IdUtils.getUid());
        blog.setTitle("编译原理");
        mapper.addBook(blog);

        blog.setId(IdUtils.getUid());
        blog.setTitle("os mit");
        mapper.addBook(blog);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogIfTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        //map.put("title","编程之美");
        map.put("author","wukai");
        List<Blog> blogs = mapper.queryBlogIf(map);

        ShowUtils.equ();
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        ShowUtils.well();
        sqlSession.commit();
        sqlSession.close();

    }

}