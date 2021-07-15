import Client.*;

public class Main {
    public static void main(String[] args) {

        Client alexey = new Person();
        System.out.println("Номер счета клиента: " + alexey.getNumberAccount());
        alexey.accountReplenishment(500);
        System.out.println("Баланс пополнен на: " + alexey.getBalance() + " рублей.");
        alexey.withdrawal(127);
        System.out.println("Снятие со счета 127 рублей. Баланс: " + alexey.getBalance() + " рублей." + "\n");

        Client ippirogova = new Entrepreneur();
        System.out.println("Номер счета клиента: " + ippirogova.getNumberAccount());
        System.out.println("Баланс клиента: " + ippirogova.getBalance() + " рублей.");
        ippirogova.accountReplenishment(900);
        System.out.println("Баланс пополнен на 900 рублей. Комиссия за пополнение 1%.");
        System.out.println("Баланс счета: " + ippirogova.getBalance() + " рублей.");
        ippirogova.withdrawal(891);
        System.out.println("Снятие со счета 891 рублей. Баланс: " + ippirogova.getBalance() + " рублей.");
        ippirogova.accountReplenishment(1500);
        System.out.println("Баланс пополнен на 1500 рублей. Комиссия за пополнение 0,5%.");
        System.out.println("Баланс счета: " + ippirogova.getBalance() + " рублей." + "\n");

        Client ooorogaikopyta = new JuridicalPerson();
        System.out.println("Номер счета клиента: " + ooorogaikopyta.getNumberAccount());
        System.out.println("Баланс клиента: " + ooorogaikopyta.getBalance() + " рублей.");
        ooorogaikopyta.accountReplenishment(1200);
        System.out.println("Баланс пополнен на: " + ooorogaikopyta.getBalance() + " рублей.");
        ooorogaikopyta.withdrawal(1000);
        System.out.println("Снятие со счета 1000 рублей. Комиссия за снятие 0,5%. Баланс: " + ooorogaikopyta.getBalance() + "рублей.");
    }

}
