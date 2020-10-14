package top.redautu.mybatis.sqlsession;

import top.redautu.cfg.Configuration;
import top.redautu.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

public class SqlSessionFactoryBuilder {
    /**
     * 根据参数的字节输入流来构建一个  SqlSessionFactory
     * @param configFile
     * @return
     */
    public SqlSessionFactory build(InputStream configFile){
        Configuration config = XMLConfigBuilder.loadConfiguration(configFile);
        return new SqlSessionFactoryImpl(config);
    }
}
