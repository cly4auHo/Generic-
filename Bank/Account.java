package genericsue;

public class Account<T> {

    private double money;
    private T id;

    public Account(double money, T id) {
        this.money = money;
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}

class Account1<T> extends Account {

    public Account1(double money, T t) {
        super(money, t);
    }
}

class Account2<T> extends Account {

    public Account2(double money, T t) {
        super(money, t);
    }
}
