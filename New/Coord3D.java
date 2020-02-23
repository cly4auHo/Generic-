package gens;

public class Coord3D extends Coord2D {
    int z;

    public Coord3D() {
        super();
    }

    public Coord3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
