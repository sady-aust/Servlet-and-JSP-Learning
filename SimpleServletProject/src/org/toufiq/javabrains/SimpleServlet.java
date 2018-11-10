package org.toufiq.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/AdvancedSimpleServletPath" },initParams= {@WebInitParam(name ="defaultUser",value="sady")})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		HttpSession session = request.getSession();
		
		if(name!=null && name.length()!=0) {
			session.setAttribute("NAME", name);
		}
		
		
		PrintWriter writer =  response.getWriter();
		writer.println("In Request name is "+name+" And in Session name is "+session.getAttribute("NAME").toString());
		
		String defaultUser = this.getServletConfig().getInitParameter("defaultUser").toString();
		
		writer.println("Default USer name is "+defaultUser);
	}
	
	

}
