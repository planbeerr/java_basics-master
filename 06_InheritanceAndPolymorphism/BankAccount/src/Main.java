import Accounts.BankAccount;
import Accounts.CardAccount;
import Accounts.DepositaryAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        System.out.println("Создан банковский счет! На Вашем счете: " + account.getMoney());
        account.depositMoney(100.56);
        System.out.println("Внесены средства! На Вашем счете: " + account.getMoney());
        account.withdrawMoney(56.4);
        System.out.println("Снятие средств! На Вашем счете: " + account.getMoney() + "\n");

        DepositaryAccount depositaryAccount = new DepositaryAccount();
        System.out.println("Создан депозитарный банковский счет! На Вашем счете: " + depositaryAccount.getMoney());
        depositaryAccount.depositMoney(56.4);
        System.out.println("Внесены средства! На Вашем счете: " + depositaryAccount.getMoney());
        depositaryAccount.withdrawMoney(20.3);
        depositaryAccount.depositMoney(84.7);
        System.out.println("Внесены средства! На Вашем счете: " + depositaryAccount.getMoney());
        depositaryAccount.withdrawMoney(45.3);


        CardAccount cardAccount = new CardAccount();
        System.out.println("Создан карточный счет. На Вашем счете: " + cardAccount.getMoney());
        cardAccount.depositMoney(500);
        System.out.println("Внесены средства! На Вашем счете: " + cardAccount.getMoney());
        cardAccount.withdrawMoney(200);
        System.out.println("Снятие средств! Комиссия за снятие 1%. На Вашем счете: " + cardAccount.getMoney() + "\n");

        System.out.println(cardAccount.send(account, 20) ? "Перевод совершен успешно!" : "На Вашем счете недостаточно средств для перевода!");
        System.out.println("На Вашем карточном счете: " + cardAccount.getMoney() + " рублей. На банковском счете: " + account.getMoney() + " рублей." + "\n");

        depositaryAccount.send(cardAccount, 20);

        System.out.println(account.send(depositaryAccount, 70) ? "Перевод совершен успешно!" : "На Вашем счете недостаточно средств для перевода!");
        System.out.println(account.getMoney());
    }
}
