package cs4050.bookstore.objectlayer;

import java.util.Date;

public class BookSales {
	//don't know if you guys want to do a date dropbox or fixed intervals
	private int last24;  
	private int last48;
	private int lastWeek;
	
	private Date date;
	private int numSold;
	
	//fixed (would have table with 3 columns that increment with each sale, script would go in at specified intervals and wipe 
	//		the target value restarting the count)
	////////////////////////////////////////////////
	public int getLast24() {
		return last24;
	}
	public void setLast24(int last24) {
		this.last24 = last24;
	}
	public int getLast48() {
		return last48;
	}
	public void setLast48(int last48) {
		this.last48 = last48;
	}
	public int getLastWeek() {
		return lastWeek;
	}
	public void setLastWeek(int lastWeek) {
		this.lastWeek = lastWeek;
	}
	
	//dropbox (would have methods returning List<BookSales> for dates, have to work out the best way to handle datebase)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getNumSold() {
		return numSold;
	}
	public void setNumSold(int numSold) {
		this.numSold = numSold;
	}
	
}
