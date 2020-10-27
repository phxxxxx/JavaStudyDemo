package top.redautu.pojo;

import java.util.Date;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/27.
 * @description:
 */

public class Blog {
    private String id;
    private String title;
    private String author;
    private Date create_time;
    private String views;

    public Blog() {
        this.id = id;
        this.title = title;
        this.author = author;
        this.create_time = create_time;
        this.views = views;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", creatTime=" + create_time +
                ", views='" + views + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getcreate_time() {
        return create_time;
    }

    public void setcreate_time(Date creat_time) {
        this.create_time = creat_time;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }
}
