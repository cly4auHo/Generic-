package genericsue;

public interface GenInterface<S, T> {

    T f(int i, S s);

    void g(T t);
}

class FirstImpl implements GenInterface<Double, String> {

    @Override
    public String f(int i, Double s) {
        return "" + i + s;
    }

    @Override
    public void g(String t) {
        System.out.println(t.length());
    }

}

class SecondImpl<S, T> implements GenInterface<S, T> {

    @Override
    public T f(int i, S s) {
        return null;
    }

    @Override
    public void g(T t) {

    }

}
