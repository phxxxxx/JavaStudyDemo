import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.redautu.Config.MyConfig;
import top.redautu.pojo.Cat;
import top.redautu.pojo.Hello;
import top.redautu.pojo.Person;
import top.redautu.service.UserService;
import top.redautu.service.UserServiceImpl;

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

  /*      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        UserService userServiceImpl = (UserService) context1.getBean("UserServiceImpl");
        userServiceImpl.getInfo();

        String s = UUID.randomUUID().toString();
        System.out.println(s);*/
        ApplicationContext context = new ClassPathXmlApplicationContext("contex.xml");
        UserService service = context.getBean("userserviceimpl", UserService.class);
        service.add();
      /*  ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("person", Person.class);
        Cat cat = context.getBean("cat", Cat.class);
        cat.sounds();
        System.out.println("************************8");
        person.getCat().sounds();
        person.getDog().sounds();*/

      /*  ApplicationContext context = new AnnotationConfigApplicationContext("contex.xml");
        UserServiceImpl userServiceImpl = context.getBean("userserviceimpl", UserServiceImpl.class);
        userServiceImpl.add();*/

    }

}
