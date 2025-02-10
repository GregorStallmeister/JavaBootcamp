package bigDecimal;

import java.math.BigDecimal;

public class Account {
    String accountNumber;
    BigDecimal accountBalance;
    Client customer;

    public void depositMoney (BigDecimal deposit) {
        accountBalance.add(deposit);
    }

    public void withdrawMoney(BigDecimal withdrawal) {
        accountBalance.subtract(withdrawal);
    }

    public Account(String accountNumber, Client customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;

        accountBalance = BigDecimal.ZERO;
    }
}
