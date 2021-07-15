package Accounts;

public class CardAccount extends BankAccount {

    protected double AMOUNTOFINTERST = 0.01;

    public void withdrawMoney(double money) {
        super.withdrawMoney(money + money * AMOUNTOFINTERST);
    }

}
