package top.redautu.log;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/28.
 * @description:
 */
@Component
public class Log implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+" 的 "+method.getName()+"被执行了");
    }
}
