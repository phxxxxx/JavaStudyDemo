package top.redautu.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.redautu.pojo.Person;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/28.
 * @description:
 */
@Configuration
@ComponentScan("top.redautu.pojo")
public class MyConfig {
    @Bean
    public Person person(){
        return new Person();
    }
}
