package ex05;

public class Main {
    public static void main(String[] args) {
        Ponto<Integer, Integer> p = new Ponto<>(3,4);
        Ponto<Number, Number> x = new Ponto<>(0,0);
        p.mostra(); // imprime (3,4)
        x.mostra(); // imprime (0,0)
        x.copy(p);
        x.mostra(); // imprime (3,4)
        //Ponto<String, Integer> erro= new Ponto<String,Integer>(“olá”,3);
// erro de compilação
    }
}
