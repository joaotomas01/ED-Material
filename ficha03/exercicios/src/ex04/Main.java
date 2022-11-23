package ex04;

public class Main {
    public static void main(String[] args) {
        Integer m[]={3,2,6,3};
        String n[]={"Ada", "Albino"};
        System.out.println(search(m,2)); // true
        System.out.println(search(n,"Francisco")); // false
    }

    private static <T> boolean search(T[] array, Comparable <? super T> key) {
        for (T t : array) {
            if (key.compareTo(t) < 0) {
                return true;
            }
        }
        return false;
    }
}
