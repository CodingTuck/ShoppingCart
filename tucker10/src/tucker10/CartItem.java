package tucker10;
//Mitchell Tucker SPC ID #2429488
public class CartItem {
	//define private data members
	private String item;
	private double price;
	private int quantity;
	
	//define constructor that sets data members when cartitem is instantiated
	public CartItem(String items, double cost, int amount) {
		setItem(items);
		setCost(cost);
		setQuantity(amount);
	}
	
	//define getters and setters for data members
	public String getItem() {
		return item;
	}
	public void setItem(String newItem) {
		this.item = newItem;
	}
	
	public double getCost() {
		return price;
	}
	public void setCost(double newCost) {
		this.price = newCost;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int newAmount) {
		this.quantity = newAmount;
	}
	
	//method that returns the total
	public double subTotal() {
		return price*quantity;
	}
	
	//string that summarizes data for an item
	public String toString() {
		return "Item: " + item + ", Price = $" + price + ", Quantity: " + quantity;
	}
}
