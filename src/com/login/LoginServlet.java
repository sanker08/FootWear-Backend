package com.login;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
    

		protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
          String username=req.getParameter("username");
   	      String password=req.getParameter("password");
   	      PrintWriter out=res.getWriter();
   	      out.println("<h1>you have Successfully logged in</h1>");
         }
}
