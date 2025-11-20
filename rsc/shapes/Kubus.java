package shapes;

public class Kubus extends Shape3D {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double getSurfaceArea() {
        return 6 * (sisi * sisi);
    }
}
