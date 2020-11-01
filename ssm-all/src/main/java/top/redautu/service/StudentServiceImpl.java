package top.redautu.service;

import org.springframework.stereotype.Service;
import top.redautu.dao.StudentDao;
import top.redautu.domain.Student;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/11/1.
 * @description:
 */
@Service
public class StudentServiceImpl implements StudentService {
	@Resource
	private StudentDao studentDao;

	@Override
	public int addStudent(Student student) {
		int nums = studentDao.insertStudent(student);
		return nums;
	}

	@Override
	public List<Student> findStudents() {

		return studentDao.selectStudent();
	}
}
