package cs4050.bookstore.persistlayer;

import ObjectLayer.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookPersistImpl {
	public void insertBook(String title, String author, String publisher, int year, int stock, float price) {
		DbAccessImpl.create("INSERT INTO BOOK (title, author, publisher, year, stock, price) VALUES ('" + title + "', '" 
				+ author + "', '" + publisher + "', '" + year + "', '" + stock +"', '"+ price + "')");
		DbAccessImpl.disconnect();
	} // insertBook
	
	public void insertBook(String title, String author, String publisher, int year, int stock) {
		DbAccessImpl.create("INSERT INTO BOOK (title, author, publisher, year, stock) VALUES ('" + title + "', '" 
				+ author + "', '" + publisher + "', '" + year + "', '" + stock + "')");
		DbAccessImpl.disconnect();
	} // insertBook
	
	public void insertBook(String title, String author, String publisher, int year) {
		DbAccessImpl.create("INSERT INTO BOOK (title, author, publisher, year) VALUES ('" + title + "', '" 
				+ author + "', '" + publisher + "', '" + year + "')");
		DbAccessImpl.disconnect();
	} // insertBook
	
	public void updateStock(int stock, int id) {
		DbAccessImpl.update("UPDATE BOOK SET stock = " + stock + " WHERE id = " + id + ";");
		DbAccessImpl.disconnect();
	}//updateStock, id
	
	public void updateStock(int stock, String title) {
		DbAccessImpl.update("UPDATE BOOK SET stock = " + stock + " WHERE title = '" + title + "';");
		DbAccessImpl.disconnect();
	}//updateStock, title
	
	public int getStock(int id){
		ResultSet result = DbAccessImpl.retrieve("select stock from book where id = " + id+";");
		int stock = -1;
		try{
			stock = result.getInt(1);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		
		return stock;
	}//getStock, id
	
	public int getStock(String title){
		ResultSet result = DbAccessImpl.retrieve("select stock from book where title = '" + title+";");
		int stock = -1;
		try{
			stock = result.getInt(1);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		
		return stock;
	}//getStock, title
	
	public void updatePrice(float price, int id) {
		DbAccessImpl.update("UPDATE BOOK SET price = " + price + " WHERE id = " + id + ";");
		DbAccessImpl.disconnect();
	}//updatePrice, id
	
	public void updatePrice(float price, String title) {
		DbAccessImpl.update("UPDATE BOOK SET price = " + price + " WHERE title = '" + title + "';");
		DbAccessImpl.disconnect();
	}//updatePrice, id
	
	public float getPrice(int id){
		ResultSet result = DbAccessImpl.retrieve("select price from book where id = " + id+";");
		float price = -1;
		try{
			price = result.getFloat(1);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		
		return price;
	}//getPrice, id
	
	public float getPrice(String title){
		ResultSet result = DbAccessImpl.retrieve("select price from book where title = '" + title + "';");
		float price = -1;
		try{
			price = result.getFloat(1);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		
		return price;
	}//getPrice, title
	
	public void updateSold(int sold, int id) {
		DbAccessImpl.update("UPDATE BOOK SET sold = " + sold + " WHERE id = " + id + ";");
		DbAccessImpl.disconnect();
	}//updateSold, id
	
	public void updateSold(int sold, String title) {
		DbAccessImpl.update("UPDATE BOOK SET sold = " + sold + " WHERE title = '" + title + "';");
		DbAccessImpl.disconnect();
	}//updateSold, title
	
	public int getSold(int id){
		ResultSet result = DbAccessImpl.retrieve("select sold from book where id = " + id + ";");
		int sold = -1;
		try{
			sold = result.getInt(1);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		
		return sold;
	}//getSold, id
	
	public int getSold(String title){
		ResultSet result = DbAccessImpl.retrieve("select sold from book where title = '" + title + "';");
		int sold = -1;
		try{
			sold = result.getInt(1);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		
		return sold;
	}//getSold, title
	
}//BookPersistImpl
