package top.redautu.pojo;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/31.
 * @description:
 */

public class User {

	private String name;
	private int age;

	public User() {
		System.out.println("user的无参构造方法>>>>>>>>>>>>>>>>>>>>>>");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setname方法执行了>>>>>>>>>>>>>>>>>>>>>>>>>>");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setage方法执行了>>>>>>>>>>>>>>>>>>>>>>>>>>");
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
