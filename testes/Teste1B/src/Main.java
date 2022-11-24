import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T> void f (List<T> list, Comparable<T> valor) {
        for (int i = 0; i < list.size(); i++) {
            if (valor.compareTo(list.get(i)) > 0) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(array);
        f(array, 5);
        System.out.println(array);
    }
}