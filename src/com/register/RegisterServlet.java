package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
        String name=req.getParameter("Cname");
        String mob=req.getParameter("Mobile");
        String mail=req.getParameter("emailid");
        String password=req.getParameter("fpassword");
        String Cpassword=req.getParameter("Cpassword");
        
        PrintWriter out=res.getWriter();
 	      out.println("<h1>you have Successfully Registered</h1>");
	}
}
