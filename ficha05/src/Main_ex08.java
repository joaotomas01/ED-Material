import java.util.Set;
import java.util.TreeMap;

public class Main_ex08 {
    public static void main(String[] args) {
        Pilha_ex08 pilha_ex08 = new Pilha_ex08<>();
        Pilha_ex08_prof pilha_ex08_prof = new Pilha_ex08_prof<>();

        pilha_ex08.push(2);
        pilha_ex08.push(4);
        pilha_ex08.push(1);
        pilha_ex08.push(5);

        pilha_ex08.show();

        pilha_ex08.pop();
        System.out.println("-->" + pilha_ex08.findMin());
        pilha_ex08.show();
    }

    void teste() {

    }
}
