package com.FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstApp extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		/*
		 * PrintWriter out = res.getWriter(); 
		 * out.println("Result is "+k);
		 * out.print("Result is "+z);
		 */
		
		// There are two methods to call a servlet from another servlet
		// 1- RequestDispatcher 
		// 2- Redirect
		
		
		
		// ------------Reuqest Dispatcher--------------
		/*
		 * req.setAttribute("ok", k); 
		 * RequestDispatcher rd = req.getRequestDispatcher("sq");
		 *  rd.forward(req, res);
		 */
		
		
		// Session Management
		// -------------------Send Redirect-------------------------------
		res.sendRedirect("sq?k="+k); // URL Redirect

	}
	

}
