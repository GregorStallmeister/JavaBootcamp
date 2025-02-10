package bigDecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        String accNumber1;
        String accNumber2;

        accNumber1 = bankService.openAccount(new Client("Max", "Mustermann", 0));
        accNumber2 = bankService.openAccount(new Client("Maxi", "Musterfrau", 1));

        bankService.transferMoney(BigDecimal.TEN, accNumber1, accNumber2);

        System.out.println(bankService);
    }
}
