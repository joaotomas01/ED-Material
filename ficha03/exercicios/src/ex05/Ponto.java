package ex05;

public class Ponto <C1 extends Number, C2 extends Number> {
    private C1 c1;
    private C2 c2;
    public Ponto(C1 c1, C2 c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public void copy(Ponto<? extends C1, ? extends C2> p) {
        c1 = p.c1;
        c2 = p.c2;
    }

    public void mostra() {
        System.out.println("Ponto: ("+c1+","+c2+")");
    }
}
