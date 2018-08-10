package com.toufiq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet Confiq and Servlet Context
 * */
public class MyServlet extends HttpServlet {
	

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		ServletContext ctx= req.getServletContext();
		String name = ctx.getInitParameter("name");
		
		PrintWriter out = res.getWriter();
		
		out.print("Hi "+name);
	}
}
