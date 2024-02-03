package com.FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		 
		  
		  
		  
		  int s = Integer.parseInt(req.getParameter("k")); 
		  PrintWriter out = res.getWriter();
		  out.println("Sum is : "+s); 
		  s = s *s;
		  
		  out.println("Square is : "+s);
		 
		

	}
	
}
