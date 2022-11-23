package rafael;

import java.util.Random;
import java.util.Arrays;

public class MainRafael {
    static int[] criaArrayCom(int valor, int dimensao, boolean diferentes) {
        int[] m = new int[dimensao];
        if(diferentes){
            for(int i=0;i<dimensao;i++)
                m[i]=i*10;
            if((valor%10!=0)||(0>valor)||(valor>(dimensao-1)*10))
                m[0]=valor;
        }
        else {
            Random r = new Random();
            int gama = Math.abs(valor)<10 ? 10 : Math.abs(valor);
            for(int i = 0; i < dimensao; i++)
                m[i] = r.nextInt(gama*4) - gama*2;
            m[0] = valor;
        }
        Arrays.sort(m);
        return m;
    }

    static boolean binRecursiva(int[] m, int chave) {
        if (m.length == 0)
            return false;
        int index = m.length/2, meio = m[index];
        if (meio == chave)
            return true;
        int[] m2;
        if (chave > meio)
            m2 = Arrays.copyOfRange(m,index+1,m.length);
        else
            m2 = Arrays.copyOfRange(m,0,index);
        return binRecursiva(m2, chave);
    }
    // versao do stor
//    static boolean binRecursiva2(int[] tab, int chave) {
//        int start = 0, end = tab.length, meio = (start+end)/2;
//
//        if (end==0) {
//            System.out.println("Tabela vazia");
//            return false;
//        }
//        if (tab[meio] == chave)
//            return true;
//        if (tab[meio] > chave)
//            end = meio - 1;
//        else
//            start = meio + 1;
//
//        if (end<tab.length) end++;
//        int[] newt = Arrays.copyOfRange(tab, start, end);
//
//        return binRecursiva2(newt, chave);
//    }
    static boolean binIterativa(int[] m, int chave) {
        int start = 0, end = m.length, meio = (start + end)/2;

        do {
            if (m[meio] == chave)
                return true;
            if (chave > m[meio])
                start = meio + 1;
            else
                end = meio - 1;
            meio = (start + end)/2;
        } while (start < end);

        if (meio >= m.length) return false;
        return m[meio] == chave;
    }

    static int binPosicao(int[] m, int chave) {
        int start = 0, end = m.length, meio = (start + end)/2;

        do {
            if (m[meio] == chave)
                return meio;
            if (chave > m[meio])
                start = meio + 1;
            else
                end = meio - 1;
            meio = (start + end)/2;
        } while (start < end);

        if (meio >= m.length) return -1;
        if (m[meio] == chave)
            return meio;
        else
            return -1;
    }

    static int binNegativos(int[] m, int chave) {
        int start = 0, end = m.length, meio = (start + end)/2;

        do {
            if (m[meio] == chave)
                return meio;
            if (chave > m[meio])
                start = meio + 1;
            else
                end = meio - 1;
            meio = (start + end)/2;
        } while (start < end);

        if (meio >= m.length)
            return -(m.length+1);
        if (m[meio] == chave)
            return meio;
        if (chave > m[meio])
            meio += 2;
        else meio += 1;

        return -meio;
    }

    static float percMenores(int[] m, int valor) {
        int pos = binNegativos(m, valor);
        if (pos < 0)
            pos = -pos-1;
        return (float)pos/m.length;
    }

    static int valsEmIntervalo(int[] m, int inf, int sup) {
        int pInf = binNegativos(m, inf), pSup = binNegativos(m, sup);

        if (pInf < 0)
            pInf = -pInf - 1;
        if (pSup < 0)
            pSup = -pSup - 2; // -pSup-1-1

        return Math.max(pSup - pInf + 1, 0);
    }

    static boolean valRepetido(int[] m, int valor) {
        int pos = binPosicao(m, valor);
        if (pos >= 0) {
            if (pos == m.length - 1)
                return m[pos-1] == m[pos];
            return m[pos+1] == m[pos];
        }
        return false;
    }

    static int maiorValorMaisBaixo(int[] m, int valor) {
        int pos = binNegativos(m, valor);
        if (pos < 0)
            pos = -pos-1;

        if (pos == 0)
            return valor;
        return m[pos-1];
    }

    static boolean binTrocados(int[] m, int chave) {
        int start = 0, end = m.length, meio = (start + end)/2;

        do {
            if (m[meio] == chave)
                return true;

//            if (chave >= 0) {
//                if (m[meio] < 0 || m[meio] > chave)
//                    end = meio - 1;
//                else
//                    start = meio + 1;
//            } else {
//                if (m[meio] >= 0 || m[meio] < chave)
//                    start = meio + 1;
//                else
//                    end = meio - 1;
//            }
            if (chave * m[meio] >= 0)   // chave e meio têm mesmo sinal
                if (m[meio] > chave) end = meio - 1;
                else start = meio + 1;
            else                        // chave e meio têm sinais opostos
                if (m[meio] > chave) start = meio + 1;
                else end = meio - 1;

            meio = (start + end)/2;
        } while (start < end);

        if (meio >= m.length) return false;
        return m[meio] == chave;
    }

    static int valorMaiorQueIndice(int[] m) {
        int start = 0, end = m.length, meio = (start + end)/2;

        do {
            if (m[meio] > meio)
                end = meio;
            else
                start = meio + 1;
            meio = (start + end)/2;
        } while (start < end);

        if (start == m.length) return -1;
        return start;
    }

    public static void main(String[] args) {
        int[] arr;
        int valor;

//        boolean res;
//        arr = new int[]{1, 2, 3, 4, 5};
//        valor = 1;
        // ex1
//        res = binRecursiva(arr,valor);
//        System.out.println("Existe valor " + valor + "? " + (res ? "Sim" : "Não"));
        // ex2
//        res = binIterativa(arr, valor);
//        System.out.println("Existe valor " + valor + "? " + (res ? "Sim" : "Não"));

//        int pos;
//        arr = new int[]{1, 2, 3, 4, 5};
//        valor = 1;
        // ex3
//        pos = binPosicao(arr, valor);
//        System.out.println("Existe valor " + valor + "? " + (pos == -1 ? "Não" : "Sim, na posição " + pos));
        // ex4
//        pos = binNegativos(arr, valor);
//        if (pos >= 0)
//            System.out.println("Existe valor " + valor + " na posição " + pos);
//        else
//            System.out.println("Valor " + valor + " não existe, deveria estar na posição " + (-pos-1));

        // ex5
//        arr = criaArrayCom(52, 10, false);
//        System.out.println(Arrays.toString(arr));
//        valor = 52;
//        float perc = percMenores(arr, valor);
//        System.out.println("% de valores menores que " + valor + ": " + perc*100 + "%");
//
        // ex6
//        arr = criaArrayCom(52, 10, false);
//        System.out.println(Arrays.toString(arr));
//        int min = 20, max = 59;
//        int n = valsEmIntervalo(arr, min, max);
//        System.out.println("Nº valores no intervalo ["+min+","+max+"]: " + n);

        // ex7
//        arr = new int[]{-1, -1, 3, 5, 5};
//        boolean repetido = valRepetido(arr, valor);
//        System.out.println("Valor " + valor + " é repetido? " + (repetido ? "Sim" : "Não"));

        // ex8
//        arr = new int[]{1, 2, 3, 4, 5};
//        valor = 3;
//        int maior = maiorValorMaisBaixo(arr, valor);
//        System.out.println("Maior valor mais baixo que " + valor + " é " + maior);

        // ex9
//        arr = new int[]{3,6,8, -10,-3,-2,-1};
//        valor = -16;
//        boolean res = binTrocados(arr, valor);
//        System.out.println("Existe valor " + valor + "? " + (res ? "Sim" : "Não"));

        // ex10
//        arr = new int[]{3,7,12,15};
//        arr = new int[]{-3,1,7,12,15};
//        arr = new int[]{-15,-14,1,2,3,4};
        arr = new int[]{-1,-2,-3,-4,-5,-6,1,2,3,4,5,11,120};
        int pos = valorMaiorQueIndice(arr);
        System.out.println("Existe valor maior que índice? " + (pos == -1 ? "Não" : "Sim, na posição " + pos));
    }
}
