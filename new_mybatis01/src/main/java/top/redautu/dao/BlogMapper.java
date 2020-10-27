package top.redautu.dao;

import top.redautu.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public interface BlogMapper {
    int addBook(Blog blog);

    List<Blog> queryBlogIf(Map map);
}
