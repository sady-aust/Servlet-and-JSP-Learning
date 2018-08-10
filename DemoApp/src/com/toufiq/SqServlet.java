package com.toufiq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		/*
		 * If sq servlet is called by RequestDispacthcer
		 */
		
		/*
		 int sum = Integer.parseInt(req.getParameter("SUM"));
		 PrintWriter out = res.getWriter();
		 int sum = (int)req.getAttribute("SUM");
		*/
		
		

		/*
		 * If sq servlet is called by SendRedirect
		 */
		
		/*
		int sum = Integer.parseInt(req.getParameter("SUM"));
		PrintWriter out = res.getWriter();
		out.println("Result is "+(sum*sum));
		*/
		
		/*
		 * Fetching data from session
		 */
		
		/*
		HttpSession session = req.getSession();
		int sum =(int)( session.getAttribute("SUM"));
		PrintWriter out = res.getWriter();
		out.println("Result is "+(sum*sum));
		*/
		
		/*
		 * Fetching data from Cookies
		 */
		 Cookie[] cookies	= req.getCookies();
				 
		for (Cookie c : cookies) {
			if(c.getName().equals("SUM")) {
				int sum = Integer.parseInt(c.getValue());
				PrintWriter out = res.getWriter();
				out.println("Result is "+(sum*sum));
				
				
				/*
				 *Servlet Context
				 *
				 *Context is a shared resource for all servlet
				 */
				
				/*
				ServletContext ctx= req.getServletContext();
				String name = ctx.getInitParameter("name");
				String phone = ctx.getInitParameter("phone");
				out.print("Hi "+name+" Your phone is "+phone);*/
				
				/*
				 * Servlet Config
				 * for each servlet we can define its servlet config
				 */
				
				ServletConfig confiq = getServletConfig();
				String name = confiq.getInitParameter("name");
				out.print("Hi "+name);
				
			}
		}
	}
}
