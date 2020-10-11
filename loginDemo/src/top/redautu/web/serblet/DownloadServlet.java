package redautu.web.serblet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("DownloadServlet>>>>>>>>>>>>>>>>>>>>>>>>>");
        String filename = request.getParameter("filename");

        //字节输入流加载进内存
        ServletContext servletContext = this.getServletContext();
        String realpath = servletContext.getRealPath("/res/"+filename);

        FileInputStream fis= new FileInputStream(realpath);
        String mimeType = servletContext.getMimeType(filename);
        response.setHeader("content-type",mimeType);
        response.setHeader("content-disposition","attachment;filename="+filename);

        //输入流写出到输出流中
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] buff = new byte[1024*8];
        int len = 0;
        while ((len = fis.read(buff))!= -1){
            outputStream.write(buff,0,len);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
