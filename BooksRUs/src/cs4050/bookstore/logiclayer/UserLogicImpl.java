package LogicLayer;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import ObjectLayer.*;
import PersistLayer.*;

public class UserLogicImpl {
	private UserPersistImpl userPersist = new UserPersistImpl();
	
	public void insertUser(String email, String username, String password, int seclevel, String fname, String lname){
		userPersist.insertUser(fname, lname, email, username, password, seclevel);
	}
	
	public void insertUser(User u){
		userPersist.insertUser(u);
	}
	
	public void deleteUser(int id){
		userPersist.deleteUser(id);
	}
	
	public User getUser(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("userId"));
		return userPersist.getUser(id);
	} // getUser
	
	public User getUser(HttpSession session) {
		int id = (int) session.getAttribute("userId");
		return userPersist.getUser(id);	
	} // getUser
	
	public int getUserId(String userName){
		return userPersist.getUserId(userName);
	} // getUserId
	
	public boolean authenticateUser(String userName, String password) {
		return userPersist.authenticateUser(userName, password);
	}
}//UserLogicImpl