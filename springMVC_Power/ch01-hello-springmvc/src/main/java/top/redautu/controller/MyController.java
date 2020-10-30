package top.redautu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: Wuk
 * @Company: jlu.edu.cn
 * @date: 2020/10/30.
 * @description:
 */
@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg","fuck you all");

        mv.addObject("like","good sleep ");

       // mv.setViewName("/WEB-INF/view/show.jsp");
        //自送使用视图解析器的前后缀连接
        mv.setViewName("show");

        return mv;


    }
}
