import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Pilha_ex08<T extends Comparable<T>> {
    Pilha<T> pilha = new Pilha<>(new ArrayList<>());
    Pilha<T> minimos = new Pilha<>(new ArrayList<>());

    public void push(T valor) {
        if (minimos.empty() || minimos.peek().compareTo(valor) > 0) {
            minimos.push(valor);
        }
        pilha.push(valor);
    }

    public T pop() {
        T valorRetirar = pilha.pop();
        if (valorRetirar.compareTo(minimos.peek()) == 0)
            minimos.pop();
        return valorRetirar;
    }

    public T findMin() {
        return minimos.peek();
    }

    public void show() {
        System.out.println("Valores:");
        pilha.show();
        System.out.println("Minimos:");
        minimos.show();
    }
}
