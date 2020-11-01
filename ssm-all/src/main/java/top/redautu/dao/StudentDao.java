package top.redautu.dao;

import top.redautu.domain.Student;

import java.util.List;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/11/1.
 * @description:
 */

public interface StudentDao {

	int insertStudent(Student student);

	List<Student> selectStudent();
}
