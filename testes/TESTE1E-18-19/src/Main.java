import java.util.Arrays;

public class Main {
    static int tamanhoExclusao(int []m, int []n) {
        int count = 0;

        for (int i = 0; i < n.length; i++) {
            if (Arrays.binarySearch(m, n[i]) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []n = {1,3,3,4,7};
        int []m = {1,2,3,3,3,3,4,5,6};
        System.out.println(tamanhoExclusao(m, n));
    }
}