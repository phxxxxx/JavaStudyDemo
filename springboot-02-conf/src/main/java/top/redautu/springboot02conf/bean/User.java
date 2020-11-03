package top.redautu.springboot02conf.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/11/1.
 * @description:
 */


/**
 * 将配置文件中的每一个属性值映射到这个组件(类)中
 * @ConfigurationProperties告诉springboot将本类中所有属性和配置文件中指定的相绑定
 * 	prefix = "user" 选择一个属性进行一一映射
 */
@PropertySource(value = {"classpath:user.properties"})
@Component
@ConfigurationProperties(prefix = "user")
public class User {

	private String name;
	private String add;
	private boolean boss;
	private int age;
	private Data birth;

	private Map<String,Object> map;
	private List<Object> list;
	private Dog dog;

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", add='" + add + '\'' +
				", boss=" + boss +
				", age=" + age +
				", birth=" + birth +
				", map=" + map +
				", list=" + list +
				", dog=" + dog +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public boolean isBoss() {
		return boss;
	}

	public void setBoss(boolean boss) {
		this.boss = boss;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
