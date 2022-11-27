import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static <T extends Comparable<? super T>> int contaUnicos(List<T> list) {
        int count = 0;
        for (int i=0; i<list.size()-1; i++) {
            System.out.println("1: " + list.get(i));
            System.out.println("2: " + list.get(i+1));

            if (list.get(i).compareTo(list.get(i+1)) == 0) {
                System.out.println("entrei");
                count++;
            }
            System.out.println();
        }
        return count;
    }

    static <T extends Comparable<? super T>> int contaUnicosV2(List<T> list) {
        int repetidos = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) == 0) {
                    System.out.println("i: " + list.get(i) + " | j: " + list.get(j));
                    repetidos++;
                }
            }
        }
        return repetidos;

    }

    static boolean pesquisa(int []m, int valorX, int valorY) {
        int start=0;
        int end = m.length-1;
        int mid = m.length/2-1;

        do {
            if (m[mid] == valorX && m[mid+1]==valorY) {
                return true;
            }

            if (valorX < m[mid]) {
                end = mid-1;
            } else if (valorX > m[mid]) {
                start = mid + 2;
            } else {
                if (m[mid] == m[mid+2]) {
                    start = mid+2;
                } else if (m[mid] == m[mid-2]) {
                    end = mid - 1;
                }
            }
            mid = (start+end)/2 - 1;
        } while (start<end);

        if (mid >= m.length)
            return false;
        if (m[mid]==valorX && m[mid+1]==valorY) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //int [] array = {1,2,1,10,3,0,3,2,4,10};
        //System.out.println(pesquisa(array, 3, 2));

        List<Integer> list = new ArrayList<>(Arrays.asList(1,10,10,10,90,91,91,100));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,10,10,90,91,91,100,100,101,101));
        System.out.println(contaUnicosV2(list));
        System.out.println(contaUnicosV2(list2));
    }
}