package viopeTasks9to11;

public class Product {
	private int productNumber;
	private String productName;
	private double productPrice;

	public Product(int productNumber, String productName, double productPrice) {
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;

	}

	public int getProductNumber() {
		return productNumber;

	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;

	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

}
