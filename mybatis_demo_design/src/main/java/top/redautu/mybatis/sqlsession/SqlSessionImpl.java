package top.redautu.mybatis.sqlsession;

import top.redautu.cfg.Configuration;
import top.redautu.mybatis.sqlsession.proxy.MapperProxy;

import java.lang.reflect.Proxy;
import java.sql.Connection;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/14.
 * @description:
 */

public class SqlSessionImpl implements SqlSession {

    private Configuration cfg;
    private Connection connection;

    public SqlSessionImpl(Configuration cfg,Connection connection) {
        this.cfg = cfg;
        connection = DateSource
    }

    /**
     * 用于创建代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass},new MapperProxy());

        return null;
    }

    /**
     * 释放资源
     */
    public void close() {

    }
}
