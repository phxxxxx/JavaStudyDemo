package top.redautu.web.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import top.redautu.web.utils.JDBCutils;

import javax.xml.transform.Templates;

public class JdbcTemplateDemo01 {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCutils.getDataSource());
    }
}
