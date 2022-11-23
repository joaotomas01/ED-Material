import java.util.Arrays;
import java.util.Random;

public class Main {

    static int[] criaArrayCom(int valor, int dimensao, boolean diferentes){
        int m[]=new int[dimensao];
        if(diferentes){
            for(int i=0;i<dimensao;i++)
                m[i]=i*10;
            if((valor%10!=0)||(0>valor)||(valor>(dimensao-1)*10))
                m[0]=valor;
        }
        else{
            Random r=new Random();
            int gama=(Math.abs(valor)<10)?10:Math.abs(valor);
            for(int i=0;i<dimensao;i++)
                m[i]=r.nextInt(gama*4)-gama*2;
            m[0]=valor;
        }
        Arrays.sort(m);
        return m;
    }

    static boolean binRecursiva(int [] tab, int chave){
        int start = 0, end = tab.length, meio = (start+end)/2;

        if (end==0) {
            return false;
        }
        if (tab[meio] == chave)
            return true;
        if (tab[meio] > chave)
            end = meio - 1;
        else
            start = meio + 1;

        if (end<tab.length)
            end++;

        int[] newt = Arrays.copyOfRange(tab, start, end);

        return binRecursiva(newt, chave);
    }

    static boolean binInterativa(int [] tab, int chave) {
        int start = 0, end = tab.length, meio = (start + end)/2;

        do {
            if (tab[meio] == chave)
                return true;
            if (chave > tab[meio])
                start = meio + 1;
            else
                end = meio - 1;
            meio = (start + end)/2;
        } while (start < end);

        if (meio >= tab.length) return false;
        return tab[meio] == chave;
    }

    public static void main(String[] args) {
        int [] array = criaArrayCom(2,10,true);
        int chave1 = 80;
        int chave2 = 12;
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("R1: " + binRecursiva(array, chave1));
        System.out.println("R2: " + binRecursiva(array, chave2));
        System.out.println("I1: " + binInterativa(array, chave1));
        System.out.println("I2: " + binInterativa(array, chave2));
    }
}