package com.takeo;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class MyServlet implements Servlet{
   public void init(ServletConfig config) throws ServletException {

   }

   public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<html><body><h2>");
        out.println("Welcome to My Web Page");
        out.println("</h2></body></html>");
   }

   public ServletConfig getServletConfig() {
        return null;
   }

   public String getServletInfo() {
    return null;
   }

   public void destroy() {

   }

}