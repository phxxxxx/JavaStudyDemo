package top.redautu.web.serblet;

import top.redautu.domain.User;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //show a sentence
//        //获取区域中的共享user对象
//        System.out.println("SuccessServlet*************dopost***************");
//        User user= (User)request.getAttribute("user");
//        //set encoding
//
//
////        request.setCharacterEncoding("utf-8");
//        response.setContentType("utf-8");
//      //response.setHeader("Content-disposition","attachement;fileneme = wukai");
////        response.setHeader("Content-disposition","inline");
//        response.getWriter().write("sign up success!"+user.getUsername()+"! welcome!!");
////        Out.write("sign up success!! welcome!!");
        int width = 100;
        int height = 50;

        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_BGR);

        Graphics pen = image.getGraphics();
        pen.setColor(Color.BLUE);
        pen.fillRect(0,0,width,height);

        pen.setColor(Color.GREEN);
        pen.drawRect(0,0,width-1,height-1);

        pen.drawString("A",20,25);
        pen.drawString("A",40,25);
        pen.drawString("A",60,25);
        pen.drawString("A",80,25);


        ImageIO.write(image,"jpg",response.getOutputStream());
        /*response.setContentType("utf-8");
        System.out.println("FaileServlet**************dopost******************");
        response.getWriter().write("sign up failed!! username or passward error");*/

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
