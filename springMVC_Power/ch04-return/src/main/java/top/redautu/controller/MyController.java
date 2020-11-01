package top.redautu.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.redautu.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/30.
 * @description:
 */
@Controller
public class MyController {

    /**
     * 逐个接收请求的参数,要求方法的形参名和请求中的参数名必须一致
     * 同名的请求参数赋给同名的形参
     *
     */
    @RequestMapping(value = "/returnstring-view.do")
    public String  returnstring( String name, int age){
        System.out.println("执行了returnstring方法------>>>>>>");
        //手工添加数据到作用域
        return "show";

    }

    @RequestMapping(value = "/returnVoidAjax.do")
    public void  doReturnsVoidAjax(HttpServletResponse response, String name, int age) throws IOException {
        System.out.println("执行了returnsVoid-ajax方法------>>>>>>");
        //处理ajax,使用json数据格式
        User user = new User();
        user.setAge(2111);
        user.setName("wukfhgujai");

        String json = "";
        //讲结果数据转为json
        if (user!=null){
            ObjectMapper objectMapper = new ObjectMapper();
            json = objectMapper.writeValueAsString(user);
            System.out.println("user对象转化为json格式后为"+json);
        }

        //输出数据,响应ajax请求
        response.setContentType("application/json;charset=utf-8");

        PrintWriter writer = response.getWriter();

        writer.println(json);
        writer.flush();

        writer.close();


    }

        /**
         * 通过框架讲对象转为json格式并返回
         */
        @RequestMapping(value = "/doReturnsUserByMvc.do")
        @ResponseBody //讲对象转为json后通过response返回
        public User doReturnsUserByMvc(String name, int age) {
            System.out.println("doReturnsUserByMvc------>>>>>>");
            User user = new User();
            user.setAge(33);
            user.setName("张妮佳");
            return user;
        }

    /**
     * 通过框架讲对象转为json格式并返回list<User>
     */
    @RequestMapping(value = "/doReturnsListByMvc.do")
    @ResponseBody //讲对象转为json后通过response返回
    public List<User> doReturnsListByMvc(String name, int age) {
        System.out.println("doReturnsListByMvc------>>>>>>");

        ArrayList<User> list = new ArrayList<>();

        User user = new User();
        user.setAge(30);
        user.setName("张亚宁");

        User user2 = new User();
        user2.setAge(10);
        user2.setName("李亚宁");

        list.add(user);
        list.add(user2);
        return list;
    }



}
