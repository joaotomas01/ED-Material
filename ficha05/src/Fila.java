import java.util.List;

public class Fila <T> extends Pilha{
    public Fila(List list) {
        super(list);
    }

    public void add(T e) {
        pilhaList.add(e);
    }

    public T remove() {
        if (pilhaList.size()>0)
            return (T) pilhaList.remove(0);

        return null;
    }

    public T element() {
        return (T) pilhaList.get(0);
    }
}
