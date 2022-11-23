import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static <T> void printList(List<? super T> list) {
        ListIterator<? super T> it = list.listIterator(list.size());
        System.out.print("[ ");
        while(it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
        System.out.println("]");
    }

    public static <T> void fill(List<T> list, T value) {
        for (T t: list){
            list.set(list.indexOf(t),value);
        }
    }

    public static <T> void fillProf(List<? super T> list, T value) {
        ListIterator<? super T> it = list.listIterator();
        while (it.hasNext()){
            it.next();
            it.set(value);
        }
    }

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(List.of("aeroporto","estrada","aviao"));

        list.add(1.0);
        list.add(2.0);
        list.add(3.0);

        System.out.println("ANTES DO FILL:");
        System.out.println(list);
        System.out.println(list2);

        //fill(list,5.0);
        //fill(list2,"carros");

        //fillProf(list,5.0);
        //fillProf(list2,"carros");

        //System.out.println();
        //System.out.println("DEPOIS DO FILL:");
        //System.out.println(list);
        //System.out.println(list2);

        printList(list);
    }
}