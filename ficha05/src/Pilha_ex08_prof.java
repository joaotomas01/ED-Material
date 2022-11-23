import java.util.ArrayList;

public class Pilha_ex08_prof <T extends Comparable<? super T>>{
    Pilha <T> val = new Pilha<>(new ArrayList<>());
    Pilha <T> min = new Pilha<>(new ArrayList<>());

    public void push (T v) {
        if (min.empty() || min.peek().compareTo(v) >= 0) {
            min.push(v); //colocar novo minimo no topo
        }
        val.push(v);
    }

    public T pop() {
        T ret = val.pop();
        if (ret.compareTo(min.peek())==0) //se remover minimo, atualizar pilha de minimos
            min.pop();
        return ret;
    }

    public T findMin() {
        return min.peek();
    }

    public void show() {
        System.out.println("Valores: ");
        val.show();
        System.out.println("Minimos: ");
        min.show();
    }
}
