package bigDecimal;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class BankService {
    Set<Account> accounts;

    public BankService() {
        this.accounts = new HashSet<Account>();
    }

    public String openAccount(Client customer) {
        String accountNumber = "" + System.currentTimeMillis();
        accounts.add(new Account(accountNumber, customer));

        return accountNumber;
    }

    public void transferMoney (BigDecimal amount, String accNumberSource, String accNumberDestination) {
        Account accSource = null;
        Account accDestination = null;

        for (Account account : accounts) {
            if (account.accountNumber.equals(accNumberSource))
                accSource = account;

            if (account.accountNumber.equals(accNumberDestination))
                accDestination = account;
        }

        if (accSource != null && accDestination != null) {
            accSource.withdrawMoney(amount);
            accDestination.depositMoney(amount);
        }
    }

    @Override
    public String toString() {
        return "BankService{" +
                "accounts=" + accounts +
                '}';
    }
}
