package cs4050.bookstore.objectlayer;

public class User {
	private int id;
	private String email;
	private String username;
	private String password;
	private int seclevel;
	private String shipaddress;
	private int cardsaved;
	private String fname;
	private String lname;
	
	public User () {}
	
	public User(int i, String f, String l, String e, String u, String p, int sec, String ship, int c){
		id =i;
		fname = f;
		lname = l;
		email = e;
		username = u;
		password = p; 
		seclevel = sec;
		shipaddress = ship;
		cardsaved = c;
		
	}
	
	public User(int i, String f, String l, String e, String u, String p, int sec, String ship){
		id =i;
		email = e;
		username = u;
		password = p; 
		seclevel = sec;
		shipaddress = ship;
		fname = f;
		lname = l;
	}
	
	public User(int i, String f, String l, String e, String u, String p, int sec){
		id =i;
		email = e;
		username = u;
		password = p; 
		seclevel = sec;
		fname = f;
		lname = l;
	}
	
	public User(String f, String l, String e, String u, String p, int sec){
		email = e;
		username = u;
		password = p; 
		seclevel = sec;
		fname = f;
		lname = l;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst(){
		return fname;
	}
	
	public void setFirst(String f){
		this.fname = f;
	}
	
	public String getLast(){
		return fname;
	}
	
	public void setLast(String l){
		this.lname = l;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSeclevel() {
		return seclevel;
	}

	public void setSeclevel(int seclevel) {
		this.seclevel = seclevel;
	}

	public String getShipaddress() {
		return shipaddress;
	}

	public void setShipaddress(String shipaddress) {
		this.shipaddress = shipaddress;
	}

	public int getCardsaved() {
		return cardsaved;
	}

	public void setCardsaved(int cardsaved) {
		this.cardsaved = cardsaved;
	}
	
}//User
