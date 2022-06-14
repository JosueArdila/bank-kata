package co.com.sofka.account;

public class MovimientType {

    private String descrption;
    public static final String DEBIT_MOVEMENT = "DEBITO";
    public static final String CREDIT_MOVEMENT = "CREDITO";
    private MovimientType(String descrption) {
        this.descrption = descrption;
    }

    public static MovimientType movimientTypeOf(String descrption) {
        return new MovimientType(descrption);
    }

    public String description() {
        return descrption;
    }
}
