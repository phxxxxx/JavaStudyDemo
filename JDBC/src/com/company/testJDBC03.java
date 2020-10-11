package com.company;

import java.sql.*;

public class testJDBC03 {
    public testJDBC03() throws Exception {
        Connection conn = null;
        Statement stat = null;
        ResultSet res = null;
        try{
            //导入驱动jar包
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取数据库连接对象
             conn = DriverManager.getConnection("jdbc:mysql://redautu.top:3306/how2java","root","Wk4478200.?");
            //定义sql语句
            String sql = "select * from hero";
            //获取执行sql的对象，Statement
             stat = conn.createStatement();
            //执行sql
            res = stat.executeQuery(sql);
            //处理结果

            while (res.next()){
                int id = res.getInt(1);
                String name = res.getString(2);
                int hp = res.getInt(3);
                int damage = res.getInt(4);

                System.out.println(id+"--------"+name+"-------"+hp+"---------"+damage);
            }


//            System.out.println(count);
//            if (count>0){
//                System.out.println("操作成功");
//            }else{
//                System.out.println("操作失败");
//            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(stat != null){
                try{
                    stat.close();
                }
                catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(conn != null){
                try{
                    conn.close();
                }
                catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }



    }
}
