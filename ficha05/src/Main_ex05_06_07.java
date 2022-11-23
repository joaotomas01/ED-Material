import java.util.*;

public class Main_ex05_06_07 {

    private static <T> void removeEven_b(List<? super T> list) {
        ListIterator<? super T> it = list.listIterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
            if (it.hasNext())
                it.next();
        }
    }
    private static <T> void removeEven_a(List<? super T> list) {
        List<T> aux = new ArrayList<>();
        ListIterator it = list.listIterator();
        while (it.hasNext()) {
            it.next();
            if (it.hasNext()) {
                aux.add((T) it.next());
            }
        }
        list.clear();
        list.addAll(aux);
    }
    private static <T> void printReverse(Collection <T> collection) {
        Pilha<T> pilha = new Pilha<>(new ArrayList<>());
        for (T valor : collection) {
            pilha.push(valor);
        }
        while (!pilha.empty())
            System.out.println(pilha.pop());

    }
    private static <T> void reverse(List<? super T> list) {
        ListIterator it1 = list.listIterator();
        ListIterator it2 = list.listIterator(list.size());
        T aux;

        while (it1.nextIndex() < list.size()/2) {   // tambem funciona com
                                                    // while (it1.nextIndex() < it2.previousIndex())
            aux = (T) it1.next();
            it1.set(it2.previous());
            it2.set(aux);
        }
    }

    private <T> void func(T val) {
        
    }

    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        //reverse(list);
        //System.out.println(list.toString());
        //printReverse(new ArrayList<>(List.of("Joao","Ricardo","Guilherme","Miguel","Maria")));
        List<String> list = new ArrayList<>(List.of("Joao","Ricardo","Guilherme","Miguel","Maria"));
        //removeEven_a(list);
        removeEven_b(list);
        System.out.println(list);
    }
}
