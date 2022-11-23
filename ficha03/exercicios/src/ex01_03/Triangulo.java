package ex01_03;

public class Triangulo extends Figura{
    private final double alt;
    private final double base;

    public Triangulo(int alt, int base) {
        this.alt = alt;
        this.base = base;
    }

    @Override
    double area() {
        return alt*base/2;
    }
}
