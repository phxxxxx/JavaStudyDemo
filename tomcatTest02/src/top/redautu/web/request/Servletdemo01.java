package top.redautu.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletdemo01")
public class Servletdemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求方式
        String method = request.getMethod();
        System.out.println(method);
        System.out.println("*************************************");
        //获取虚拟目录
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        System.out.println("*************************************");
        //获取servlet路径
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        System.out.println("*************************************");
        //获取get方法请求参数
        String queryString = request.getQueryString();
        System.out.println(queryString);
        System.out.println("*************************************");
        //获取请求URI
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestURL);
        System.out.println("*************************************");
        //获取协议版本
        String protocol = request.getProtocol();
        System.out.println(protocol);
        System.out.println("*************************************");
        //获取客户机的ip地址
        String localAddr = request.getLocalAddr();
        String remoteAddr = request.getRemoteAddr();
        System.out.println(localAddr);
        System.out.println(remoteAddr);
        System.out.println("*************************************");


        String user_agent = null;
        user_agent = request.getHeader("user-agent");
        if(user_agent.contains("Chrome")){
            System.out.println("chrome is coming");
        }else if (user_agent.contains("Edg")){
            System.out.println("微软来啦、、、、、、、、、");
        }
    }
}
