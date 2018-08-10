package com.toufiq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class AddServlet extends HttpServlet {
	
	/*public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int sum = i+j;
		PrintWriter out = res.getWriter();
		out.println("Result is "+sum);
	}*/
	
	
	
	/*
	 * doPost Method will be called if the form is submit as post
	 */
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int sum = i+j;
		/*PrintWriter out = res.getWriter();
		out.println("Result is "+sum);*/
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
	
	}
	
	/*
	 * doGet Method will be called if the form is submit as Get
	 */
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int sum = i+j;
		
		
		
		/*
		 * Calling sqServlet from Addservlet using RequestDispatcher
		 */
		
		/*
	    req.setAttribute("SUM", sum);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		*/
		
		
		/*
		 * Calling sqServlet from Addservlet using SendRedirect
		 */
		/*
		res.sendRedirect("sq?SUM="+sum);
		*/
		
		/*
		 * @Send Data using HTTPSession
		 */
		
		/*
		HttpSession session = req.getSession();
		session.setAttribute("SUM", sum);
		res.sendRedirect("sq");
		*/
		
		/*
		 * Sending Data using Cookies
		 */
		Cookie cookie = new Cookie("SUM", Integer.toString(sum));
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}
}
