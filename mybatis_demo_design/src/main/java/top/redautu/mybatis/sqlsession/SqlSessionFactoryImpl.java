package top.redautu.mybatis.sqlsession;

import top.redautu.cfj.Configuration;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/14.
 * @description: SqlSessionFactory的实现类
 */

public class SqlSessionFactoryImpl implements SqlSessionFactory{


    private Configuration config;

    public SqlSessionFactoryImpl(Configuration config){
        this.config = config;
    }
    /**
     * 用于创建一个新的操控数据库对象
     * @return
     */
    public SqlSession openSession() {
        return new SqlSessionImpl(config);
    }
}
