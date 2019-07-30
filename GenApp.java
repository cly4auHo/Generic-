package genericsue;

public class GenApp {

    public static void main(String[] args) {
        FirstGeneric<String> fg = new FirstGeneric<>();
        FirstGeneric<Boolean> fg2 = new FirstGeneric<>();

        fg.print("Allo ", "daun");
        fg2.print(Boolean.TRUE, "!");

    }
}

class Second<U, V> {
    U u;
    V v;
}
