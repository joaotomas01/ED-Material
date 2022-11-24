public class Main {
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
        int [] array = {1,2,1,10,3,0,3,2,4,10};
        System.out.println(pesquisa(array, 3, 2));
    }
}