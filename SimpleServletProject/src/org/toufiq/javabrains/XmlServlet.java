package org.toufiq.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username").toString();
	
		PrintWriter writer = response.getWriter();
		writer.println("<p>Hello Get method </p>"+username);
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username").toString();
		String fullname = request.getParameter("fullname").toString();
		
		String profession = request.getParameter("prof").toString();
		//String location = request.getParameter("location").toString();
		String[] arr = request.getParameterValues("location");
	
		PrintWriter writer = response.getWriter();
		writer.println("<p>Hello Post method  </p>"+username+" Full name is "+fullname+" Your profession is "+profession);
		writer.println("Your Selected location is "+arr.length);
		
		for(String s : arr) {
			writer.println(s);
		}
		
	
		
	
		
		
		
	}

}
