package top.redautu.springboot02conf;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.redautu.springboot02conf.bean.Person;
import top.redautu.springboot02conf.bean.Student;
import top.redautu.springboot02conf.bean.User;

/**
 * springboot的单元测试,可以很方便的进行自动注入功能
 */

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot02ConfApplicationTests {
	@Autowired
	User user;


	@Autowired
	Person person;



	@Test
	public void test2(){

		System.out.println(user);

	}

	@Test
	public void test(){


		System.out.println(person);
	}


}
