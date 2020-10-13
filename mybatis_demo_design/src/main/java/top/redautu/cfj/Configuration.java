package top.redautu.cfj;

import java.util.Map;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/13.
 * @description: 自定义mybatis的配置类
 */

public class Configuration {
    private String driver;
    private String url;
    private String username;
    private String password;
    private String mapper;

    public Map<String, Mapper> getMappers() {
        return mappers;
    }

    public void setMappers(Map<String, Mapper> mappers) {
        this.mappers.putAll(mappers);//this.mappers = 这种会使得主配置文件只能有一个（每次赋值被覆盖）
    }

    private Map<String,Mapper> mappers;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMapper() {
        return mapper;
    }

    public void setMapper(String mapper) {
        this.mapper = mapper;
    }
}
