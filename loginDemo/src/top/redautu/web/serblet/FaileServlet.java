package top.redautu.web.serblet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FaileServlet")
public class FaileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //show a sentence

        //set encoding
//        request.setCharacterEncoding("utf-8");
        response.setContentType("utf-8");
        System.out.println("FaileServlet**************dopost******************");
        response.getWriter().write("sign up failed!! username or passward error");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
