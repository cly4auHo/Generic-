package genericsue;

public class GenMethodUse {

    <U> void method(String s, U u) {
        System.out.println(u.getClass());
    }

    <T> void print(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {

        GenMethodUse gmu = new GenMethodUse();
        gmu.method("Itea", new String("qwerty"));
        Boolean[] array = {false, true, false, true};
        gmu.print(array);
    }
}
