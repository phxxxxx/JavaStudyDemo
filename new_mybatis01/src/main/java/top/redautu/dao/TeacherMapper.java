package top.redautu.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.redautu.pojo.Teacher;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public interface TeacherMapper {
    @Select("select * from teacher")
    Teacher getTeacher();
}
