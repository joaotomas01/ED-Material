package ex01_03;

abstract class Figura implements Comparable<Figura> {
    abstract double area();

    @Override
    public int compareTo(Figura o) {
        double dif = area() - o.area();

        if (dif>0) return 1;
        if (dif<0) return -1;
        return 0;
    }

    protected double getArea() {
        return area();
    }
}
