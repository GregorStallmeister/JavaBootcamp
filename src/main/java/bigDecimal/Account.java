package bigDecimal;

import java.math.BigDecimal;

public class Account {
    String accountNumber;
    BigDecimal accountBalance;
    Client customer;

    public void depositMoney (BigDecimal deposit) {
        accountBalance = accountBalance.add(deposit);
    }

    public void withdrawMoney(BigDecimal withdrawal) {
        accountBalance = accountBalance.subtract(withdrawal);
    }

    public Account(String accountNumber, Client customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;

        accountBalance = BigDecimal.ZERO;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customer=" + customer +
                '}';
    }
}
