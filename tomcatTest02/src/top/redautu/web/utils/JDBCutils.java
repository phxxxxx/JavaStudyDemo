package top.redautu.web.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCutils {
    private static DataSource ds;

    static {

        try {
            //加载配置文件
            Properties pro = new Properties();
            pro.load(JDBCutils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //获取DATASOURCE
            ds =  DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    //释放资源
    public static void close(Statement stam,Connection conn)  {
     /*   if (stam != null){
            try {
                stam.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null){
            try {
                stam.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
        close(null,stam,conn);
    }

    //释放资源
    public static void close(ResultSet rs, Statement stam, Connection conn)  {
        if (stam != null){
            try {
                stam.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null){
            try {
                stam.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null){
            try {
                stam.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    //获取连接池的方法
    public static DataSource getDataSource(){
        return ds;
    }

}
