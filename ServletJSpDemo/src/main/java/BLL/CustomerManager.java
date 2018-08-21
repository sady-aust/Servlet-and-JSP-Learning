package BLL;

import java.sql.SQLException;

import com.toufiq.Modal.Customer;

import DAL.CustomerGetway;

public class CustomerManager {

	
	CustomerGetway aGetway =  new CustomerGetway();
	public Customer getCustomer(int id) {
		
		
		return aGetway.getCustomer(id);
	}
	
	public boolean insertCustomer(Customer customer) {
		return aGetway.addCustomer(customer);
	}
}
