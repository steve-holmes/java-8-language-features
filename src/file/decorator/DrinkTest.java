package file.decorator;

public class DrinkTest {

	public static void main(String[] args) {
		Drink d1 = new Whiskey();
		printReceipt(d1);
		
		Drink d2 = new Honey(new Whiskey());
		printReceipt(d2);
		
		Drink d3 = new Spices(new Vodka());
		printReceipt(d3);
		
		Drink d4 = new Spices(new Honey(new Rum()));
		printReceipt(d4);
	}

	public static void printReceipt(Drink drink) {
		String name = drink.getName();
		double price = drink.getPrice();
		System.out.println(name + " - $" + price);
	}
}
