package Accounts;

public class BankAccount {
    private double money;

    public double getMoney() {
        return money;
    }

    public void depositMoney(double money) {
        this.money += money;
    }

    public void withdrawMoney(double money) {
        this.money -= money;
    }

    public boolean send (BankAccount receiver, double amount) {
        if (money >= amount) {
            withdrawMoney(amount);
            receiver.depositMoney(amount);
            return true;
        }
        else {
            return false;
        }
    }
}

