package top.redautu.springboot02conf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.redautu.springboot02conf.bean.User;

/**
 * springboot的单元测试,可以很方便的进行自动注入功能
 */
@SpringBootTest
class Springboot02ConfApplicationTests {
	@Autowired
	User user3;

	@Autowired
	User user4;
	@Test
	void contextLoads() {
		System.out.println(user3);
	}
	@Test
	void heheh(){
		System.out.println(user4);
	}

}
