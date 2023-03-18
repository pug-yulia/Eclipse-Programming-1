package viopeTasks9to11;

import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Item> itemList;

	public ShoppingCart() {
		itemList = new ArrayList<Item>();

	}

	public void add(Product product, int quantity) {
		Item item = new Item(product, quantity);
		itemList.add(item);
	}

	public void remove(Product product) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getProduct().getProductNumber() == product.getProductNumber()) {
				itemList.remove(i);
				break;
			}
		}

	}

	public double getTotalPrice() {
		double total = 0;
		for (Item item : itemList) {
			total += item.getSubtotal();
		}
		return total;

	}

	@Override
	public String toString() {
		String output = "=== Shopping cart ===\n";
		
		if (itemList.isEmpty()) {
			output = "There are no items in the shopping cart." + "\n";
		
			
		} else {
			double totalPrice = getTotalPrice();
			
			for (Item item : itemList) {
				Product product = item.getProduct();
				int quantity = item.getQuantity();
				double unitPrice = product.getProductPrice();
				double subtotal = item.getSubtotal();
				output += product.getProductNumber() + ": " + product.getProductName() + ", quantity: " + quantity + ", unit price: "
						+ String.format("%.2f", unitPrice) + ", subtotal: " + String.format("%.2f", subtotal) + "\n";
				
			}
			
			output += "TOTAL PRICE: " + String.format("%.2f", totalPrice) + " euros\n";
		}
		
		return output;

	}
}
