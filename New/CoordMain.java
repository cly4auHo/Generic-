package gens;

public class CoordMain {
    public static void main(String[] args) {
        Coord2D[] c2d = {new Coord2D(1, 1), new Coord2D(2, 2)};
        Coord3D[] c3d = {new Coord3D(1, 1, 1), new Coord3D(2, 2, 2)};

        CoordGen<Coord2D> gc2d = new CoordGen<Coord2D>(c2d);
        CoordGen<Coord3D> gc3d = new CoordGen<Coord3D>(c3d);

        gc2d.showXY(gc2d);
        gc3d.showXYZ(gc3d);
    }
}
