package Client;

public class JuridicalPerson extends Client{

    final double AMOUNTOFINTERST = 0.01;

    public void withdrawal(double money) {
        super.withdrawal(money + money * AMOUNTOFINTERST);
    }
}
