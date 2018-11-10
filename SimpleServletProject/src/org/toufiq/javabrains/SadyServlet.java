package org.toufiq.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SadyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter writer = resp.getWriter();
		
		String initPeramInXml = this.getServletConfig().getInitParameter("xmlPeram").toString();
		writer.println("We can also init peram in XML..The init peram  in xml is "+initPeramInXml);
	}

}
