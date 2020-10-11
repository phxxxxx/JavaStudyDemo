package top.redautu.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.redautu.domain.User;
import top.redautu.utils.JDBCutils;

public class UserDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCutils.getDataSource());

    public User login(User loginUser){
        //编写sql

        try{
            String sql = "select * from USER where USERNAME = ? and PASSWARD = ?";
            //use query method
            User user =  jdbcTemplate.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(),
                    loginUser.getPassward());

            return user;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
