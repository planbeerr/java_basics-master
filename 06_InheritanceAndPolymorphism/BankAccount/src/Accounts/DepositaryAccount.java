package Accounts;

import java.time.LocalDate;

public class DepositaryAccount extends BankAccount{

    private LocalDate depositDate = LocalDate.now();

    public void withdrawMoney(double money) {

        if (LocalDate.now().isBefore(depositDate.plusMonths(1))) {
            System.out.println("Вы не можете снять средства c депозитарного счета в течении одного месяца"+ "\n");
        }
        else {
            super.withdrawMoney(money);
        }
    }

    public void depositMoney(double money) {
        depositDate = LocalDate.now();
        super.depositMoney(money);
    }
}
