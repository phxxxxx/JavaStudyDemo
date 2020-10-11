package top.redautu.web.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTest {


    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //获取连接
             connection = JDBCutils.getConnection();
            //定义sql
            String sql = "insert into hero values(null,?,?,?)";
            //获取pstam对象
             preparedStatement = connection.prepareStatement(sql);
            //给?赋值
            preparedStatement.setString(1,"王五");
            preparedStatement.setDouble(2,245);
            preparedStatement.setDouble(3,245);
            //执行sql
            int count = preparedStatement.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCutils.close(preparedStatement,connection);
        }

    }
}
