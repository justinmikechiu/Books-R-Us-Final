package cs4050.bookstore.persistlayer;

import cs4050.bookstore.objectlayer.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserPersistImpl {
	
	public void insertUser(String firstName, String lastName, String email, String userName, String password, int seclevel) {
		DbAccessImpl.create("INSERT INTO USER (fname, lname, email, userName, password, seclevel) VALUES ('" + firstName + "', '" 
				+ lastName + "', '" + email + "', '" + userName + "', '" + password + "', '" + seclevel + "')");
		
		DbAccessImpl.disconnect();
	} // insertUser
	
	public User getUser(int userId) {
		ResultSet result = DbAccessImpl.retrieve("SELECT fname, lname, email, username, password, seclevel, shipaddress, carsaved FROM user WHERE id = "+  userId +";");
		User user = null;
		try {
			while (result.next()) {
				user = new User(userId, result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getInt(6), result.getString(7), result.getInt(8));
			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		DbAccessImpl.disconnect();
		return user;
	} // getUser
	
	public void updateUsername(String username, int userId) {
		DbAccessImpl.update("UPDATE user SET username = " + username + " WHERE id = " + userId + ";");
		DbAccessImpl.disconnect();
	}//updateUsername
	
	public String getUsername(int userId) {
		ResultSet result = DbAccessImpl.retrieve("SELECT username FROM user WHERE id = "+  userId +";");
		String username = null;
		try {
			while (result.next()) {
				username = result.getString(1);
			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		DbAccessImpl.disconnect();
		return username;
	}//getUsername
	
	public void updatePassword(String password, int userId) {
		DbAccessImpl.update("UPDATE user SET password = '" + password + "' WHERE id = " + userId + ";");
		DbAccessImpl.disconnect();
	}//updatePassword
	
	public String getPassword(int userId) {
		ResultSet result = DbAccessImpl.retrieve("SELECT password FROM user WHERE id = "+  userId +";");
		String password = null;
		try {
			while (result.next()) {
				password = result.getString(1);
			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		DbAccessImpl.disconnect();
		return password;
	}//getPassword

	public void updateEmail(String email, int userId) {
		DbAccessImpl.update("UPDATE user SET email = '" + email + "' WHERE id = " + userId + ";");
		DbAccessImpl.disconnect();
	}//updateEmail
	
	public String getEmail(int userId) {
		ResultSet result = DbAccessImpl.retrieve("SELECT email FROM user WHERE id = "+  userId +";");
		String email = null;
		try {
			while (result.next()) {
				email = result.getString(1);
			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		DbAccessImpl.disconnect();
		return email;
	}//getEmail
}
