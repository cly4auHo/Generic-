package genericsue;

public class BankApp {

    public static void main(String[] args) {

        Account<String> from = new Account1<>(2000, "12367");
        Account<String> to = new Account2<>(1000, "absic1488");

        Transaction<Account<String>> tr = new Transaction<>(from, to, 500);
        tr.execute();
        System.out.println("First account " + from.getMoney() + " second account " + to.getMoney());
    }
}
