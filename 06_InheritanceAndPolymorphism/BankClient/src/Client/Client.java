package Client;

public abstract class Client {

    private double balance;
    private long numberAccount = getRandomAccountMumber();

    protected static int getRandomAccountMumber() {
        long max = 99999999;
        return (int) (Math.random() * ++max);
    }

    public long getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void accountReplenishment(double money) {
        this.balance += money;
    }

    public void withdrawal(double money) {
        this.balance -= money;
    }

}
