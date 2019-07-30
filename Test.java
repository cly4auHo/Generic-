package genericsue;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Orange> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i <= 99; i++) {
            list.add(new Orange());
        }
//        list.add(new Apple()); //невозможно, лист ужже приведен к типу

        for (int i = 0; i < list.size(); i++) {
            ((Orange) list.get(i)).getWeight();
        }
    }
}

class Apple {

    String colour;
}

class Orange {

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    double weight;
    String sort;
}
