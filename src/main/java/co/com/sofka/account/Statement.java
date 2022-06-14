package co.com.sofka.account;

import java.util.ArrayList;
import java.util.List;

import static co.com.sofka.account.Movement.movementOf;

public class Statement {
    List<Movement> movements;

    public Statement() {
        this.movements = new ArrayList<>();
    }

    void addMovement(Amount amount, DateMovement date, String movimientType, Balance balance) {
        movements.add(movementOf(amount, date, movimientType, balance));
    }

    void printStatement() {
        StringBuilder information = doHeader();
        this.movements.stream().
                forEach(movement -> {
                    doBody(movement.movementInformation(), information);
                });
        System.out.println(information);
    }

    public void printDeposits() {
        StringBuilder information = doHeader();
        this.movements.stream().
                filter(movement -> movement.movimientType().equals(MovimientType.CREDIT_MOVEMENT)).
                forEach(m -> {
                    doBody(m.movementInformation(), information);
                });
        System.out.println(information);
    }

    private StringBuilder doHeader() {
        return new StringBuilder("  date  |  credit  |  debit  |  balance  \n");
    }

    private StringBuilder doBody(String value, StringBuilder information) {
        String [] fields = value.split("&");
        information.append(fields[0] + " |    " + (fields[1].equals(MovimientType.CREDIT_MOVEMENT) ? fields[2] : 0) + " |    "
                + (fields[1].equals(MovimientType.DEBIT_MOVEMENT) ? fields[2] : 0) + " |    " + fields[3] + "\n");

        return information;
    }
}
