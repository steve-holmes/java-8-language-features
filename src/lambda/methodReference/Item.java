package lambda.methodReference;

import java.util.function.Supplier;

public class Item implements Priced {
	private String name = "Unknown";
	private double price = 0.0;
	
	public Item() {
		System.out.println("Constructor Item() called.");
	}
	
	public Item(String name) {
		this.name = name;
		System.out.println("Constructor Item(String) called.");
	}
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
		System.out.println("Constructor Item(String, Double) called.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void test() {
		Supplier<String> s1 = this::toString;
		Supplier<String> s2 = Item.super::toString;
		Supplier<Double> s3 = this::getPrice;
		Supplier<Double> s4 = Priced.super::getPrice;
		
		System.out.println("this::toString: " + s1.get());
		System.out.println("Item.super::toString: " + s2.get());
		System.out.println("this::getPrice: " + s3.get());
		System.out.println("Priced.super::getPrice: " + s4.get());
	}
}
