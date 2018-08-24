package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Model.User;

public class UserGetway {
	
	public UserGetway() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean getCustomer(String uName,String pass) {
		try {
		
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			
			Statement statement = connection.createStatement();
			
			String query ="SELECT * FROM user WHERE username ='"+uName+"' AND password ='"+pass+"'";
			ResultSet res = statement.executeQuery(query);
			
			if(res.next()) {
				return true;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
