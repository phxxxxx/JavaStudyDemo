package top.redautu.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import top.redautu.pojo.Student;
import top.redautu.pojo.Teacher;
import top.redautu.utils.MybatisUtils;

import java.util.List;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public class StudentMapperTest {
    @Test
    public void getStudentTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();

        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
