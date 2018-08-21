package com.toufiq;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.toufiq.Modal.Customer;

import BLL.CustomerManager;

/**
 * Servlet implementation class GetCustomerController
 */
public class GetCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		
		CustomerManager aManager = new CustomerManager();
		Customer customer = aManager.getCustomer(id);
		
		RequestDispatcher rd = request.getRequestDispatcher("showCustomer.jsp");
		request.setAttribute("aCustomer", customer);
		rd.forward(request, response);
	}


}
