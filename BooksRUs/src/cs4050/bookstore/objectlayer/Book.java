package cs4050.bookstore.objectlayer;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int ISBN;
	private String title;
	private String author;
	private String publisher;
	private List<Genre> genres; 
	private int year;
	private double price;
	private int stock;
	private int sold;
	private int hold;
	private String imgurl;
	
	public Book() {}
	
	public Book(int i, String t, String a, String p, int y, int r, int s, float f, int h, String img){
		ISBN = i;
		title = t;
		author = a;
		publisher = p;
		year = y;
		stock = r;
		sold = s;
		price = f;
		hold = h;
		imgurl = img;
	}
	
	public Book(int i, String t, String a, String p, int y, int r, float f, String img){
		ISBN = i;
		title = t;
		author = a;
		publisher = p;
		year = y;
		stock = r;
		price = f;
		imgurl = img;
	}
	
	public Book(int i, String t, String a, String p, int y, float f, String img){
		ISBN = i;
		title = t;
		author = a;
		publisher = p;
		year = y;
		price = f;
		imgurl = img;
	}
	
	
	public int getISBN(){
		return ISBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getHold() {
		return hold;
	}
	public void setHold(int hold) {
		this.hold = hold;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	
	
	
}
