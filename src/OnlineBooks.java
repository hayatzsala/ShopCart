import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class OnlineBooks {
	public static ArrayList <Book> shopcart=new ArrayList <Book>();
	
	/**
	 * this method for add book to your shopping cart
	 * @param name :the name of book
	 * @param p    :the prize of one unit
	 * @param num  :the number of units of one book
	 */
	public static void AddToCart() {
		String name=null;
		double p=0.0;
		int num=0;
		name=JOptionPane.showInputDialog("Enter the name of Book to add:");
		p=Double.parseDouble(JOptionPane.showInputDialog("Enter the price,please:"));
		num=Integer.parseInt(JOptionPane.showInputDialog("Enter how many unit you need:"));
		Book newOne =new Book(name);
		newOne.setNum(num);
		newOne.setPrize(p);
		shopcart.add(newOne);		
		JOptionPane.showMessageDialog(null,"Thank you, The book added successfully");
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
