package top.redautu.service;

import top.redautu.domain.Student;

import java.util.List;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/11/1.
 * @description:
 */

public interface StudentService {
	int addStudent(Student student);
	List<Student> findStudents();
}
