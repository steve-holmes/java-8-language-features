package interfaces;

import java.time.LocalDate;

public interface ATM {
	boolean login(int account); // throws AccountNotFoundException;
	boolean deposit(double amount);
	boolean withdraw(double amount); // throws InsufficientFundException;
	double getBalance();
	
	public static interface Card {
		String getNumber();
		String getSercurityCode();
		LocalDate getExpirationDate();
		String getCardHolderName();
	}
}
