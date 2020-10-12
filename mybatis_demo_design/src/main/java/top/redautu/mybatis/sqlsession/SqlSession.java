package top.redautu.mybatis.sqlsession;

/**
 * @Author: Wuk
 * @description: 自定义mybatis中和数据库交互的核心类，可创建dao接口的代理对象
 * @date: 2020/10/12.
 */

public interface SqlSession {
    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
