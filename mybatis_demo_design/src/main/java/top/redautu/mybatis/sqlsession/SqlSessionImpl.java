package top.redautu.mybatis.sqlsession;

import top.redautu.cfj.Configuration;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/14.
 * @description:
 */

public class SqlSessionImpl implements SqlSession {

    private Configuration cfg;

    public SqlSessionImpl(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * 用于创建代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return null;
    }

    /**
     * 释放资源
     */
    public void close() {

    }
}
