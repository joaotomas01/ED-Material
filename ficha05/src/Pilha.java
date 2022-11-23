import java.util.List;
import java.util.ListIterator;

public class Pilha <T>{
    List<? super T> pilhaList;

    public Pilha(List <? super T> list) {
        this.pilhaList = list;
        pilhaList.clear();
    }

    private void func()

    public boolean empty() {
        return pilhaList.size() == 0;
    }

    public T peek() {
        return (T) pilhaList.get(pilhaList.size()-1);
    }

    public T pop() {
        return (T) pilhaList.remove(pilhaList.size() - 1);
    }

    public void push(T n) {
        pilhaList.add(n);
    }

    public void show() {
        ListIterator<? super T> i = pilhaList.listIterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
