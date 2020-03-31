package genericsue;

public class Transaction<U extends Account<String>> {

    private final U from;
    private final U to;
    private final double summa;

    public Transaction(U from, U to, double summa) {
        this.from = from;
        this.to = to;
        this.summa = summa;
    }

    public void execute() {

        if (from.getMoney() < summa) {
            System.out.println("You are bomj");
            return;
        } else {
            from.setMoney(from.getMoney() - summa);
            to.setMoney(to.getMoney() + summa);
            System.out.println("Complite");
        }
    }
}
