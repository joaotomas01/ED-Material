import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static <T extends Comparable<? super T> > T getMaiorGenerico(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        T maior, temp;

        if (it.hasNext())
            maior = it.next();
        else return null;

        while (it.hasNext()) {
            temp = it.next();
            if (temp.compareTo(maior) > 0)
                maior = temp;
        }
        return maior;
    }
    public static Double getMaior(Iterable<Double> iterable) {
        Iterator<Double> it = iterable.iterator();
        Double maior, temp;

        if (it.hasNext())
            maior = it.next();
        else return null;

        while (it.hasNext()) {
            temp = it.next();
            if (temp > maior)
                maior = temp;
        }
        return maior;
    }
    /*
    public static void main(String[] args) {
        DezReaisMutavel reais = new DezReaisMutavel();
        ItDezReaisMutavel idrm00 = new ItDezReaisMutavel(reais);
        ItDezReaisMutavel idrm01 = new ItDezReaisMutavel(reais);
        int j = 0;
        Double db1;

        // ADICIONA OS NUMEROS AO ARRAY
        for (int i=0; i<10; i++) {
            reais.acrescenta(i*0.1 + 5.0);
        }

        reais.acrescenta(1.0);
        reais.acrescenta(-1.0);
        reais.acrescenta(-3.0);
        reais.acrescenta(4.0);
        reais.acrescenta(4.0);

        // PERCORRE O ARRAY COMPLETO
        System.out.println("ARRAY COMPLETO:");
        while(idrm00.hasNext()) {
            System.out.println((j++)+": ultimo: "+ idrm00.next());
        }

        System.out.println();

        // PERCORRE O ARRAY ATÉ 5.4
        System.out.println("ARRAY COMPLETO ATÉ AO 5.4:");
        j=0;
        while(idrm01.hasNext() && (db1 = idrm01.next()) < 5.4) {
            System.out.println((j++)+": ultimo: "+ db1);
        }

        // REMOVE
        idrm01.remove();

        ItDezReaisMutavel idrm02 = new ItDezReaisMutavel(reais);
        j=0;

        System.out.println();
        System.out.println("ARRAY COMPLETO SEM O 5.4:");
        while(idrm02.hasNext()) {
            System.out.println((j++)+": " + idrm02.next());
        }
    }
    */
    public static void main(String[] args) {
        DezReais reais = new DezReais();
        DezReaisMutavel reaisM = new DezReaisMutavel();
        List<Double> list = new ArrayList<>();

        // ADICIONA OS NUMEROS AO ARRAY reais
        for (int i=0; i<10; i++) {
            reais.add(i*0.1 + 5.0);
        }

        // ADICIONA OS NUMEROS AO ARRAY reaisM
        for (int i=0; i<10; i++) {
            reaisM.acrescenta(i*0.1 + 5.0);
        }

        for (int i=0; i<10; i++) {
            list.add(i*0.1 + 5.0);
        }

        System.out.println("reais: "+ getMaior(reais));
        System.out.println("reaisM: "+ getMaior(reaisM));
        System.out.println("list: "+ getMaior(list));
    }
}

