package Client;

public class Entrepreneur extends Client{

    final double BEFORETHOUSAND = 0.01;
    final double AFTERTHOUSAND = 0.005;

    @Override
    public void accountReplenishment(double money) {
        if (money < 1000) {
            super.accountReplenishment(money - money * BEFORETHOUSAND);
        }
        else if (money > 1000) {
            super.accountReplenishment(money - money * AFTERTHOUSAND);
        }
    }

}
