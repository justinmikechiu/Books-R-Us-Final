package PersistLayer;

import ObjectLayer.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PayPersistImpl {
	public void insertPayment(int userid, String cardNum, String expDate, String csc, String name, String billingaddr){
		DbAccessImpl.create("INSERT INTO payment (userid, cardNum, expDate, csc, name, billingaddr) VALUES ('" + userid + "', '" 
				+ cardNum + "', '" + expDate + "', '" + csc + "', '" + name + "', '" + billingaddr + "')");
		
		DbAccessImpl.disconnect();
	}//insertPayment
	
	public Payment getPayment(int userid){
		ResultSet result = DbAccessImpl.retrieve("SELECT * FROM user WHERE id = "+  userid +";");
		Payment pay = null;
		try {
			while (result.next()) {
				pay = new Payment(userid, result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6));
			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		DbAccessImpl.disconnect();
		
		return pay;
	}
	
}
