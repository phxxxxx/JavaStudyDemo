package top.redautu.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.redautu.pojo.Teacher;
import top.redautu.utils.MybatisUtils;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public class TeacherMapperTest {
    @Test
    public void getTeachersTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teachers = mapper.getTeacher();

        System.out.println(teachers);

        sqlSession.close();
    }
}
