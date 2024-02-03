package com.Form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisForm extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String course = req.getParameter("courses");
		String check = req.getParameter("box");
		
		PrintWriter out = res.getWriter();
		
		if(check!=null)
		{
			out.println("<h1>Name: "+name+"<h1>");
			out.println("<h1>Password: "+password+"<h1>");
			out.println("<h1>Email: "+email+"<h1>");
			out.println("<h1>Gender: "+gender+"<h1>");
			out.println("<h1>Course: "+course+"<h1>");
			
		}
		else
		{
			out.print("<h1>You have not checked condition<h1>");
		}
	}
}
