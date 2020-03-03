package tucker10;
import java.util.ArrayList;
//Mitchell Tucker SPC ID #2429488
public class Cart {
	//define private data members 
	private ArrayList<CartItem> numItems;
	public static double total = 0;
	
	//define constructor that instantiates the ArrayList of cart items
	public Cart() {
		this.numItems = new ArrayList<>();
	}
	
	//add a cart item and update total
	public void add(String item, double price, int quantity) {
		numItems.add(new CartItem(item, price, quantity));
		total = total + price * quantity;
	}
	
	//method to print and number the arraylist cart items. also prints cart total formatted
	public void showCart() {
		//loop to iterate through arraylist
		for (int i = 0; i < numItems.size(); i++) {
			System.out.println((i + 1) + " - " + numItems.get(i));
		}
		
		System.out.printf("Cart total: %.2f \n\n", total);
		
	}
	
	//removes an item based on its specific number in the cart
	public void removeItem(int number) {
		total = total - numItems.get(number-1).getCost();
		numItems.remove(number-1);
	}
}
