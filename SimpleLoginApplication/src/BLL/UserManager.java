package BLL;

import DAL.UserGetway;

public class UserManager {
	UserGetway aGetway = new UserGetway();
	
	public boolean isAvailable(String uName,String password) {
		if(aGetway.getCustomer(uName, password)) {
			return true;
		}
		return false;
	}
}
