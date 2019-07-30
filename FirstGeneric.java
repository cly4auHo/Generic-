package genericsue;

public class FirstGeneric<U> {

    int i = 88;
    boolean flag = true;
    U u;

    void setU(U u) {
        this.u = u;
    }

    U getU() {
        return u;
    }

    void print(U u, String s) {
        System.out.println(u + s);
    }
}
