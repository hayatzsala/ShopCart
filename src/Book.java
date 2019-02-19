/** 
 * 
 * @author SALAWDEH
 * Every book have an object of class book
 *
 */
public class Book {
	public String nameBook ;
	public double prize;
	public int num;
	/**
	 * constructer for Book
	 * @param name name_of the book passing to constructer 
	 */
	public Book(String name) {
		this.nameBook=name;
		
	}
	/**
	 * 
	 * @param p prize of the book
	 */
	public void  setPrize(double p) {
		this.prize=p;
	}
	/**
	 * 
	 * @param num number of books  to add in  cart
	 */
	public void setNum(int num) {
		this.num=num;
	}
	/**
	 * 
	 * @return return the name of this Book
	 */
	public String getName() {
		return this.nameBook;
	}
	/**
	 * 
	 * @return return the number of this Book in cart
	 */
	public int getnumBook() {
		return this.num;
	}
	/**
	 * 
	 * @return return the prize of one unit of this book
	 */
	public double getPrize() {
		return this.prize;
	}
}
