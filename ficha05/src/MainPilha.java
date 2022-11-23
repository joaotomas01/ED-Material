import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainPilha {

    public static double testa(Pilha p, long size) {
        long startTime = System.nanoTime();
        for (int i=0; i<size; i++) {
            p.push(i);
        }
        for (int i=0; i<size; i++) {
            p.pop();
        }
        return (System.nanoTime()-startTime) / 1000000.0;
    }

    public static void main(String[] args) {
        List arrayList = new ArrayList<>();
        List linkedList = new LinkedList();

        long n, size=50000, nruns=20;
        double time;

        Pilha pal = new Pilha(arrayList);
        Pilha pll = new Pilha(linkedList);

        System.out.println("Tempo de execução médio " + nruns + " execuções (ms)");
        System.out.println("N | ArrayList | LinkedList");

        for (int i=1; i<=30; i++) {
            n = size * i;   //tamanho do pacote de dados a meter neste ciclo

            time = 0;
            for (int j=0; j<nruns; j++) {
                time += testa(pal, n);
            }
            System.out.printf("%d | %9.2f | ",i, (float)(time/nruns));

            time = 0;
            for (int j=0; j<nruns; j++) {
                time += testa(pll, n);
            }
            System.out.printf("%.2f\n",(float)(time/nruns));
        }
    }
}
