package co.com.sofka.account;

import static co.com.sofka.account.MovimientType.*;

public class Movement {

    private Amount amount;
    private DateMovement date;
    private MovimientType movimientType;
    private Balance balance;

    private Movement(Amount amount, DateMovement date, MovimientType movimientType, Balance balance) {
        this.amount = amount;
        this.date = date;
        this.movimientType = movimientType;
        this.balance = new Balance(balance.value());
    }

    public static Movement movementOf(Amount amount, DateMovement date, String movimientType, Balance balance) {
        return new Movement(amount, date , movimientTypeOf(movimientType), balance);
    }

    public String movementInformation() {
        return date.format() + "&" + movimientType.description() + "&" + amount.amount() + "&" + balance.value();
    }

    public String movimientType() {
        return movimientType.description();
    }
}
