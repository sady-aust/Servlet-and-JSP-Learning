package com.toufiq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.toufiq.Modal.Customer;

import BLL.CustomerManager;

/**
 * Servlet implementation class AddCustomerController
 */
@WebServlet("/addCustomer")
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("csName");
		int age = Integer.parseInt(req.getParameter("csAge"));
		String address = req.getParameter("csAddress");
		double salary = Double.parseDouble(req.getParameter("salary"));
		
		CustomerManager aManager = new CustomerManager();
		boolean isInserted=aManager.insertCustomer(new Customer(age, name, address, salary));
		
		PrintWriter out = resp.getWriter();
		if(isInserted) {
			out.println("Inserted Successfully");
		}
		else {
			out.println("Not Inserted");
		}
		
		
	}
	
	

}
