import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.redautu.pojo.Hello;
import top.redautu.service.UserService;

import java.util.UUID;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public class Test {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        UserService userServiceImpl = (UserService) context1.getBean("UserServiceImpl");
        userServiceImpl.getInfo();

        String s = UUID.randomUUID().toString();
        System.out.println(s);
    }

}
