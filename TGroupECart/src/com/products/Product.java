package com.products;

class Product {
	//
	private String productName;
	private int quantity;
	private int price;
	private int totalPrice;

	// parameterize constructor
	Product(String productName, int quantity, int price, int totalPrice) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.totalPrice = totalPrice;
	}

	// getter methods
	public String getPname() {
		return productName;
	}

	public int getQty() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	// displayFormat
	public static void displayFormat() {

		System.out.print("\nName      Quantity    Price   Total Price\n");
	}

	// display bill
	public void display() {
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(getPname() + "\t" + getQty() + "\t" + getPrice() + "\t" + getTotalPrice());
	}

}
