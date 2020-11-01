package top.redautu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/11/1.
 * @description:
 */

//用来标注是springboot的主程序类,说明是springboot项目
@SpringBootApplication
public class HelloMainApplication {
	public static void main(String[] args) {

		//启动springboot应用
		SpringApplication.run(HelloMainApplication.class,args);
	}
}
