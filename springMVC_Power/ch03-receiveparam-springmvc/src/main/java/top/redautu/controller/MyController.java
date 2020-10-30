package top.redautu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
    @RequestMapping(value = "/recevice.do")
    public ModelAndView doSome(String name, int age){
        ModelAndView mv = new ModelAndView();

        mv.addObject("myname",name);
        mv.addObject("myage",age);

       // mv.setViewName("/WEB-INF/view/show.jsp");
        //自送使用视图解析器的前后缀连接
        mv.setViewName("show");
        return mv;
    }



}
