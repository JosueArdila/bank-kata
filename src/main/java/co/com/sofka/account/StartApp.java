package co.com.sofka.account;

import static co.com.sofka.account.Amount.amountOf;
import static co.com.sofka.account.DateMovement.dateMovementOf;

public class StartApp {
	
	public static void main(String[] args) {
		Account account = new Account(new Statement());

		account.deposit(amountOf(1000), dateMovementOf("10/01/2021"));
		account.deposit(amountOf(2000), dateMovementOf("13/01/2021"));
		account.withdrawal(amountOf(500), dateMovementOf("14/01/2021"));
		
		account.printStatements();
		account.printDeposits();
	}

}