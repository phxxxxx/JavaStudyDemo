package top.redautu.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.redautu.pojo.Student;
import top.redautu.pojo.Teacher;

import java.util.List;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public interface StudentMapper {

    List<Student> getStudents();

    Teacher getTeacher(@Param("tid") int id);
}
