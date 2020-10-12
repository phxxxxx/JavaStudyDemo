package top.redautu.mybatis.sqlsession;

public interface SqlSessionFactory {
    /**
     * 用于打开一个新的sqlsession对象
     */
    SqlSession openSession();
}
