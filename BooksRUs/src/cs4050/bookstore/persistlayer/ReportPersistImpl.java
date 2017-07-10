package cs4050.bookstore.persistlayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ObjectLayer.BookSales;
import ObjectLayer.PublisherSales;
import ObjectLayer.DayReport;

public class ReportPersistImpl {
	//date format yyyy-mm-dd
	public void createDayReport(String date){
		DbAccessImpl.create("INSERT INTO dayreport (date) VALUES ('" + date + "')");
		DbAccessImpl.disconnect();
	}
	
	public void createBookSales(int bookid, String date){
		DbAccessImpl.create("INSERT INTO booksales (book_id, date) VALUES ('" +bookid+ "', '"+ date + "')");
		DbAccessImpl.disconnect();
	}
	
	public void createPublisherSales(int publisherid, String date){
		DbAccessImpl.create("INSERT INTO publishersales (publisher_id, date) VALUES ('"+publisherid+"', '" + date + "')");
		DbAccessImpl.disconnect();		
	}
	
	
	public DayReport getDayReport(String date){
		ResultSet result = DbAccessImpl.retrieve("SELECT * FROM dayreport WHERE date = '"+  date +"';");
		DayReport report = null;
		try {
			while (result.next()) {
//				report = new DayReport( result.getFloat(1), result.getFloat(2), result.getFloat(3), result.getFloat(4), result.getString(5));
			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		DbAccessImpl.disconnect();
		
		if(report == null){
			createDayReport(date);
			getDayReport(date);
		}
		
		return report;
	}
	
	public List<BookSales> getBookSales(String date){
		ResultSet result = DbAccessImpl.retrieve("SELECT * FROM booksales WHERE date = '"+  date +"';");
		ArrayList<BookSales> report = new ArrayList<BookSales>();
		try {
			while (result.next()) {
//				BookSales bookSales = new BookSales(result.getInt(1), result.getInt(2), result.getString(3));
//				report.add(bookSales);
			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		DbAccessImpl.disconnect();
		return report;
	}
	
	public BookSales getBookSales(int bookId){
		ResultSet result = DbAccessImpl.retrieve("SELECT * FROM booksales WHERE book_id = '"+  bookId +"';");
		BookSales report = null;
		try {
			while (result.next()) {
//				report = new BookSales(result.getInt(1), result.getInt(2), result.getString(3));
			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		DbAccessImpl.disconnect();
		return report;
	}
	
	public List<PublisherSales> getPublisherSales(String date){
		ResultSet result = DbAccessImpl.retrieve("SELECT * FROM publishersales WHERE date = '"+  date +"';");
		ArrayList<PublisherSales> report = new ArrayList<PublisherSales>();
		try {
			while (result.next()) {
//				PublisherSales publisherSales = new PublisherSales(result.getInt(1), result.getInt(2), result.getFloat(3));
//				report.add(publisherSales);
			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		DbAccessImpl.disconnect();
		
		return report;
	}
	
	public PublisherSales getPublisherSales(int publisherId){
		ResultSet result = DbAccessImpl.retrieve("SELECT * FROM publishersales WHERE publisher_id = '"+  publisherId +"';");
		PublisherSales report = null;
		try {
			while (result.next()) {
//				report = new PublisherSales(result.getInt(1), result.getInt(2), result.getFloat(3));
			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		}  // try-catch
		DbAccessImpl.disconnect();
		
		return report;
	}
	
}
