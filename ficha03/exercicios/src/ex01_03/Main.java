package ex01_03;

public class Main {
    public static void main(String[] args) {
        String[] tab1 = {"Ana", "Joao", "Manel", "Manel", "Ze"};
        String chave = "Manel";

        System.out.println("ex1: "+comp1(tab1, chave));
        System.out.println("ex2: "+comp2(tab1, chave));

        Rectangulo rectangulo = new Rectangulo(3, 3);
        Quadrado quadrado = new Quadrado(3);
        Triangulo triangulo = new Triangulo(3,3);
        System.out.println("--EX02--");
        System.out.println("-ex01_03.Rectangulo: " + rectangulo.getArea());
        System.out.println("-ex01_03.Quadrado: " + quadrado.getArea());
        System.out.println("-ex01_03.Triangulo: " + triangulo.getArea());
        System.out.println("-retangulo com quadrado: "+rectangulo.compareTo(quadrado));
        System.out.println("-quadrado com rectangulo: "+quadrado.compareTo(rectangulo));
        System.out.println("-rectangulo com triangulo: "+rectangulo.compareTo(triangulo));
        System.out.println("-triangulo com rectangulo: "+triangulo.compareTo(rectangulo));
        System.out.println("-retangulo com quadrado (alinea b): " + compareTo_alinea_b(quadrado, rectangulo));
        System.out.println("-retangulo com quadrado (alinea c): " + compareTo_alinea_c(quadrado, rectangulo));
    }

    // ex 01
    public static <T> boolean comp1(T[] m, T chave) {
        int i=0;
        for (T t : m) {
            if (t.equals(chave))
                i++;
        }
        return i > 1;
    }

    // ex 02
    public static <T extends Comparable <T>> boolean comp2(T[] m, T chave){
        int i=0;
        for (T t : m) {
            if (chave.compareTo(t) == 0)
                i++;
        }
        return i > 1;
    }

    static public int compareTo_alinea_b(Rectangulo object1, Comparable <? super Rectangulo> object2) {
        return object2.compareTo(object1);
    }

    static public <T> int compareTo_alinea_c(T object1, Comparable <? super T> object2) {
        return object2.compareTo(object1);
    }
}