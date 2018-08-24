package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BLL.UserManager;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserManager aManager = new UserManager();
       
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("username").trim();
		String password = request.getParameter("pass").trim();
		
		if(aManager.isAvailable(userName, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", userName);
			session.setAttribute("password", password);
			response.sendRedirect("welcome.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
	}

	

}
