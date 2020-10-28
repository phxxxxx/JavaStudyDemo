package top.redautu.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/28.
 * @description:
 */
@Component
public class AfterLog implements AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法，返回了"+o);
    }
}
