package tucker10;
import java.util.Scanner;
public class CartTest {
//Mitchell Tucker SPC ID #2429488
	public static void main(String[] args) {
		//declare scanner for user input
		Scanner input = new Scanner(System.in);
		
		//creates a new object of Cart and adds items to the list.
		Cart newCart = new Cart();
		newCart.add("Echo Dot", 29.99, 3);
		newCart.add("Wemo plug", 39.99, 2);
		newCart.add("Ear buds", 49.99, 2);
		newCart.add("Google Home", 79.99, 1);
		newCart.add("Computer", 699.99, 1);
		newCart.add("Keyboard and Mouse", 150.00, 1);
		
		//shows cart
		newCart.showCart();	
		char userPrompt; //declare variable
		int itemNum; //declare variable
		
		System.out.println("Do you wish to remove an item before checkout (y/n)?");
		userPrompt = input.next().charAt(0);
		
		//loop to continue until user is done removing items
		while (userPrompt == 'y') {
				System.out.println("Enter an item number to remove: ");
				itemNum = input.nextInt();
				newCart.removeItem(itemNum);
				newCart.showCart();
				System.out.println("Do you wish to remove an item before checkout (y/n)?");
				userPrompt = input.next().charAt(0);
		}
		
		//shows updated cart with removed items after user presses 'n'
		newCart.showCart();
		
	}

}
