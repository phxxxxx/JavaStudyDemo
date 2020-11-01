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

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(String name,int age){
        ModelAndView mv = new ModelAndView();

        mv.addObject("name",name);

        mv.addObject("age",age);

        // mv.setViewName("/WEB-INF/view/show.jsp");
        //自送使用视图解析器的前后缀连接
        mv.setViewName("show");

        return mv;


    }


}
