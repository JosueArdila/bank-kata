package co.com.sofka.account;

public class Amount {
    private int amount;
    private Amount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("The amount can not be a negative value");
        }
        this.amount = amount;
    }
    public static Amount amountOf(int amount) {
        return new Amount(amount);
    }

    public int amount() {
        return amount;
    }
}
