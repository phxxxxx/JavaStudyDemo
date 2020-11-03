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
@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties("person")
public class Person {

	private String  lastName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String  name;
	private Integer age;
	private Boolean boss;

	@Override
	public String toString() {
		return "Person{" +
				"lastName='" + lastName + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				", boss=" + boss +
				'}';
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getBoss() {
		return boss;
	}

	public void setBoss(Boolean boss) {
		this.boss = boss;
	}
}
