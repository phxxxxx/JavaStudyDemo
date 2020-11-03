package top.redautu.springboot02conf.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/11/2.
 * @description:
 */
//@PropertySource(value = {"classpath:user.properties"})
//@Component
//@ConfigurationProperties("user")
public class Student {
	private String sex;
	private int age;

	@Override
	public String toString() {
		return "Student{" +
				"name='" + sex + '\'' +
				", age=" + age +
				'}';
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
