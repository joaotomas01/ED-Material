package ex01_03;

public class Rectangulo extends Figura{
    protected int larg, alt;

    public Rectangulo(int larg, int alt) {
        this.larg = larg;
        this.alt = alt;
    }

    @Override
    double area() {
        return larg * alt;
    }
}
