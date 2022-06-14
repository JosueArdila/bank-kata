package co.com.sofka.account;

public class Balance {

    private int value;
    public Balance() {
        this.value = 0;
    }

    public Balance(int value) {
        this.value = value;
    }
    public void debitAction(int valuePa) {
        value -= valuePa;
    }

    public void creditAction(int valuePa) {
        value += valuePa;
    }

    public int value() {
        return value;
    }


}
