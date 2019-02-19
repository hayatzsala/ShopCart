import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineBooks {
	public static ArrayList <Book> shopcart=new ArrayList <Book>();
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name of book");
		String nameBook = scanner.next();
		System.out.println("Enter the prize of book :");
		double prizeBook = scanner.nextDouble();
		System.out.println("Enter how many one you need ? ");
		int numBook = scanner.nextInt();
		AddToCart(nameBook,prizeBook,numBook);
	}
	/**
	 * this method for add book to your shopping cart
	 * @param name :the name of book
	 * @param p    :the prize of one unit
	 * @param num  :the number of units of one book
	 */
	public static void AddToCart(String name, double p, int num) {
		Book newOne =new Book(name);
		newOne.setNum(num);
		newOne.setPrize(p);
		shopcart.add(newOne);		
	}
	/**
	 * for delete any book from the shopping cart
	 * @param name
	 */
	public static void DelFrCart(String name) {
		for(Book book : shopcart) {
			if(book.getName().equals(name)) {
				shopcart.remove(book);
			}
		}
		
	}
	/**
	 * find the total cost for your shopping cart
	 * @return
	 */
	public static double totalCost() {
		double cost=0;
		if(shopcart.size()== 0) {
		
		}
		else if(shopcart.size()== 1) {
			cost =shopcart.get(0).getPrize() * shopcart.get(0).getnumBook();
					}
		else if (shopcart.size()>1) {
			for (Book book : shopcart) {
				
				cost+=book.getPrize()*book.getnumBook();
					
			}
		}
		return cost;
	
	}
	
	

}
