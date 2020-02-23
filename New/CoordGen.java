package gens;

public class CoordGen<T extends Coord2D> {
    T[] t;

    public CoordGen(T[] t) {
        this.t = t;
    }

    public void showXY(CoordGen<? extends Coord2D> coord) {
        for (int i = 0; i < coord.t.length; i++)
            System.out.println(coord.t[i].x + " " + coord.t[i].y);
    }

    public void showXYZ(CoordGen<? extends Coord3D> coord) {
        for (int i = 0; i < coord.t.length; i++)
            System.out.println(coord.t[i].x + " " + coord.t[i].y + " " + coord.t[i].z);
    }
}
