package top.redautu.mybatis.sqlsession.proxy;

import top.redautu.cfg.Mapper;
import top.redautu.mybatis.utils.Executor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/14.
 * @description:
 */

public class MapperProxy implements InvocationHandler {

    private Map<String,Mapper> mappers;
    private Connection connection;


    private MapperProxy(Map<String, Mapper> mappers,Connection connection){
        this.mappers = mappers;
        this.connection= connection;
    }
    /**
     * 用于对方法进行增强，此处就是调用selectList方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //获取方法名
        String methodName = method.getName();
        //获取方法所在类的名称
        String className = method.getDeclaringClass().getName();
        //组合key
        String key = className+"."+methodName;
        //获取mappers中的Mapper对象
        Mapper mapper = mappers.get(key);
        //判断是否有mapper
        if(mapper==null){
            throw new IllegalArgumentException("传入的参数有误");
        }
        //调用工具类执行查询所有

        return new Executor().selectList(mapper,connection);
    }
}
