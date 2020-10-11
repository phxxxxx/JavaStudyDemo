package top.redautu.web.serblet;

import org.apache.commons.beanutils.BeanUtils;
import top.redautu.dao.UserDao;
import top.redautu.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("LoginServlet......dopost................");
        request.setCharacterEncoding("utf-8");
/*
        String username = request.getParameter("username");
        String passward = request.getParameter("passward");

        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassward(passward);*/

        //使用beanutils工具类进行数据封装
        Map<String, String[]> mapdata = request.getParameterMap();
        User loginUser = new User();

        try {
            BeanUtils.populate(loginUser,mapdata);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        UserDao dao = new UserDao();
        User user = dao.login(loginUser);
        System.out.println(user);
        if(user == null){
            System.out.println("密码输入错误进入failservlet");
            request.getRequestDispatcher("/FaileServlet").forward(request,response);


        }else {
            System.out.println("密码输入成功进入successservlet");
            request.setAttribute("user",user);
            request.getRequestDispatcher("/SuccessServlet").forward(request,response);


        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
