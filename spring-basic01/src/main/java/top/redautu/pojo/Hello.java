package top.redautu.pojo;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public class Hello {
    private String str;

    public Hello(){
        System.out.println("无参构造执行 ");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
