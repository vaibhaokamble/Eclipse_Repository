package vaibhao.vk;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Test extends HttpServlet{
 public void doGet(HttpServletRequest request,HttpServletResponse 
response)throws ServletException,IOException{
response.setContentType(“text/html”);
PrintWriter out=response.getWriter();
 out.println(“good evening”);
}
}