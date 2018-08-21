package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Statement;

import com.toufiq.Modal.Customer;

public class CustomerGetway {
	
	
	public Customer getCustomer(int aId) {
		Customer customer = new Customer();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/labmid", "root", "");
			
			Statement statement = conn.createStatement();
			 ResultSet res= statement.executeQuery("SELECT * FROM customer WHERE CustomerId = "+aId);
			if(res.next()) {
				
				customer.setName(res.getString("Name"));
				customer.setAddress(res.getString("Address"));
				customer.setAge(res.getInt("Age"));
				customer.setSalary(res.getDouble("Salary"));
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return customer;
	}
	
	
	public boolean addCustomer(Customer customer) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/labmid", "root", "");
			
			String query = "INSERT INTO customer (Name,Address,Age,Salary) VALUES (?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(query);
			
			statement.setString(1, customer.getName());
			statement.setString(2, customer.getAddress());
			statement.setInt(3, customer.getAge());
			statement.setDouble(4, customer.getSalary());
			
			int res = statement.executeUpdate();
			
			if(res>0) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 System.out.println("Error in Inserting");
		}
		
		return false;
	}

}
