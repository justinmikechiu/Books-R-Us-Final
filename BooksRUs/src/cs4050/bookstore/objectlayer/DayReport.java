package cs4050.bookstore.objectlayer;

public class DayReport {
	private double cashInTotal;//  mostly symbolic, I might be able to script something that "adds cash" to the store when a held 
	private double cashOutTotal;// book reaches it's final hold date and just assuming the customer "came into the store" and bought it
	
	private double cardInTotal;// also something scriptable with a few of our buttons. Admin clicking on low inventory could click
	private double cardOutTotal;// on Order to "purchase" books and online purchases will go to cardInTotal obviously 
	
	private double netTotal;
	

public DayReport(double cashInTotal, double cashOutTotal, double cardInTotal, double cardOutTotal, double netTotal) {
	super();
	this.cashInTotal = cashInTotal;
	this.cashOutTotal = cashOutTotal;
	this.cardInTotal = cardInTotal;
	this.cardOutTotal = cardOutTotal;
	this.netTotal = netTotal;
}

}
