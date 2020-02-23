package gens;

public class GenMain {
    public static void main(String[] args) {
        Integer[] intarray = {3, 4, 6};
        Double[] doublearray = {3., 4., 6.};

        Gen<Integer> gInt = new Gen<Integer>(intarray);
        Gen<Double> gDouble = new Gen<Double>(doublearray);

        System.out.println(gInt.average());
        System.out.println(gDouble.average());
        System.out.println(gInt.checkAverage(gDouble));
    }
}
