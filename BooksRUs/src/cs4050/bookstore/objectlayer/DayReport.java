package cs4050.bookstore.objectlayer;

public class DayReport {
	private double cashInTotal;//  mostly symbolic, I might be able to script something that "adds cash" to the store when a held 
	private double cashOutTotal;// book reaches it's final hold date and just assuming the customer "came into the store" and bought it
	
	private double cardInTotal;// also something scriptable with a few of our buttons. Admin clicking on low inventory could click
	private double cardOutTotal;// on Order to "purchase" books and online purchases will go to cardInTotal obviously 
	
	private double netTotal;

	public double getCashInTotal() {
		return cashInTotal;
	}

	public void setCashInTotal(double cashInTotal) {
		this.cashInTotal = cashInTotal;
	}

	public double getCashOutTotal() {
		return cashOutTotal;
	}

	public void setCashOutTotal(double cashOutTotal) {
		this.cashOutTotal = cashOutTotal;
	}

	public double getCardInTotal() {
		return cardInTotal;
	}

	public void setCardInTotal(double cardInTotal) {
		this.cardInTotal = cardInTotal;
	}

	public double getCardOutTotal() {
		return cardOutTotal;
	}

	public void setCardOutTotal(double cardOutTotal) {
		this.cardOutTotal = cardOutTotal;
	}

	public double getNetTotal() {
		return netTotal;
	}

	public void setNetTotal(double netTotal) {
		this.netTotal = netTotal;
	}
	
	
}
