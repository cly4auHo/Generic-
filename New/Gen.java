package gens;

public class Gen<T extends Number> {
    T[] t;

    public Gen(T[] t) {
        this.t = t;
    }

    public T[] getT() {
        return t;
    }

    public void getType() {
        System.out.println(t.getClass());
    }

    public double average() {
        double result = 0;

        for (int i = 0; i < t.length; i++)
            result += t[i].doubleValue();

        return result / t.length;
    }

    public boolean checkAverage(Gen<?> obj) {
        return average() == obj.average();
    }
}
