package co.com.sofka.account;

import java.time.LocalDate;

public class Account {
    private Statement statement;
    private Balance balance;
    public Account(Statement statement) {
        this.statement = statement;
        this.balance = new Balance();
    }
    void deposit(Amount amount, DateMovement date) {
        balance.creditAction(amount.amount());
        statement.addMovement(amount, date, MovimientType.CREDIT_MOVEMENT, balance);
    }
    void withdrawal(Amount amount, DateMovement date){
        balance.debitAction(amount.amount());
        statement.addMovement(amount, date, MovimientType.DEBIT_MOVEMENT, balance);
    }
    void printStatements() {
        statement.printStatement();
    }

    void printDeposits() {
        statement.printDeposits();
    }
}